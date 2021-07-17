# Idea开发JavaWeb的总结

## 1. 使用到的技术

​	java基础，高级特性。Servlet + Jsp技术，Ajax技术，JDBC

## 2. 项目架构

​	项目一般采用MVC三层架构，所谓MVC，就是Model，View，Controller。翻译过来就是模型层，视图层还有控制层。

**MVC设计模式：**

![img](https://gitee.com/yu_chao_ping/typora/raw/master/images/20190603152425689.png)

**视图View**：

​		负责页面的显示；与用户的交互。包含各种表单。 实现视图用到的技术有html/css/jsp/js等前端技术。

用户交互：用户鼠标点击页面；填写页面中各种表单........等等

**模型Model：**

​		模型负责各个功能的实现（如登录、增加、删除功能）。模型用JavaBean实现。

**JavaBeans :**

```html
①是Java中一种特殊的类（换言之：JavaBean就是一个Java类）.

一个Java类 ，满足以下要求，则可称为一个JavaBean

  a. public修饰的类，提供public 无参构造方法

  b. 所有属性 都是private

  c. 提供getter和setter方法

②从使用层面来看，JavaBean分为2大类：

  a. 封装业务逻辑的JavaBean （eg:LoginDao.java 封装了登录逻辑）

  b. 封装数据的JavaBean （实体类：eg：Student.java  Vedio.java 。往往对应于数据库中的一张表，即数据库中有个Student表，项目中就有个Student.java类）

③JavaBean 是一个可以重复使用的组件，通过编写一个组件来实现某种通用功能，“一次编写、任何地方执行、任何地方重用”。

```

**控制器Controller:**

​		控制器负责将视图与模型一一对应起来。相当于一个模型分发器。所谓分发就是：①接收请求，并将该请求跳转（转发，重定向）到模型进行处理。②模型处理完毕后，再通过控制器，返回给视图中的请求处。建议使用Servlet实现控制器。

**我的项目中的目录结构**

 ![image-20210717101856739](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210717101856739.png)

**MVC与三层架构的对应关系，图示如下：** 

![img](https://gitee.com/yu_chao_ping/typora/raw/master/images/20190603151709124.png)

## 3. 项目使用layui搭建数据展示页面

### 3.1 前端代码

```html
<table id="student"></table>
<script>
    layui.use('table', function(){
        const table = layui.table;
        table.render({
            elem: '#student'                  // 对应html中id=student的table标签
            ,url:'/layuiPage/findAllStudent'  // 数据请求路径
            ,cols: [[                         // 表格列  以下为表头
                {field:'id',  title: 'ID'}				// field 属性名  title 页面显示名
                ,{field:'stuName',  title: '姓名'}
                ,{field:'sex', title: '性别'}
                ,{field:'stuAge', title: '年龄'}
                ,{field:'classNo', title: '班级', minWidth: 150}
                ,{field:'tel', title: '联系方式'}
            ]]
            ,page: true
        });
    });
</script>
```

​		由以上代码可以知道，页面数据请求路径为`/layuiPage/findAllStudent`，所以我们可以编写数据展示Servlet类，获取并处理这个请求。于是访问这个网址，[localhost:8080/layuiPage/findAllStudent?page=1&limit=2](http://localhost:8080/layuiPage/findAllStudent?page=1&limit=2)，得到如下数据。

```json
{
  "code": 0,
  "count": 103,
  "data": [
    {
      "classNo": 1,
      "id": 1832105,
      "sex": "男",
      "stuAge": 20,
      "stuName": "高云飞",
      "tel": "13289447594"
    },
    {
      "classNo": 1,
      "id": 1832106,
      "sex": "男",
      "stuAge": 21,
      "stuName": "高明明",
      "tel": "16058464781"
    }
  ],
  "msg": "请求成功"
}
```

​		一眼看出这是JSON格式的数据，共有四个属性。有code，作用不明；count，代表数据的总条数；data，即是数据对象数组；msg，请求的信息。

### 3.2 JSON数据封装类

​		应该能顺势想到，建一个JSON数据封装类，把数据都装进这个对象，最后转成JSON数据格式发送回前端页面。

![image-20210717120016525](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210717120016525.png)

​		这里用到了lombok这个插件，方便javaBean的编写。在Idea中需要先安装此插件，再在项目中引入其jar包，就可以使用以上注释开发Javabean了。

> 注意：在属性中有泛型是，Builder的使用变成：类名.<泛型>Builder.属性1(属性值)...build()

```java
LayUiResult<Student> layUiResult = LayUiResult.<Student>builder().code(0).msg("请求成功").count(count).data(students).build();
```



## 4. 数据库分页查询

数据库分页查询代码为: 

```sql
select stu_no id , stu_name stuName,  sex , tel,class_no classNo ,age stuAge from student limit  start,size
```

```java
public List<Student> findAllByPage(int start, int size) {

        // 获取QueryRunner
        QueryRunner qr = new QueryRunner(DruidDBUtil.getDatasource());
        String sql = "select stu_no id , stu_name stuName,  sex , tel,class_no classNo ,age stuAge from student limit ?,?";
        try {
            return qr.query(sql, new BeanListHandler<>(Student.class), start, size);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }
```

根据前端页面需要展示指定数据，使用limit关键字查询从start条开始后面size条数据。可以推算，查询第n页数据时`start=(n-1)*size`，`size`不变。

控制层对`start`和`size`处理代码如下：

```java
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取前端传递的参数
        req.setCharacterEncoding("utf-8");
        // 获取配置 page limit
        int page = Integer.parseInt(req.getParameter("page"));
        int size = Integer.parseInt(req.getParameter("limit"));

        int start = (page-1)*size;

        LayUiResult<Student> result = studentService.findByPage(start, size);

        // 以Json类型数据的格式响应数据
        String strResult = JSON.toJSONString(result);
        // 通过响应对象获取输出流
        resp.setContentType("application/json;charset=utf-8");

        resp.getWriter().write(strResult);


    }
```

要将java对象转成JSON对象输出到前端页面，要引入fastjson.jar包

```java
// 以Json类型数据的格式响应数据
String strResult = JSON.toJSONString(result);
```

## 5. 页面展示

![image-20210717124016251](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210717124016251.png)

## 6. 出错总结

maven工程中pom.xml的配置如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>cn.kgc</groupId>
  <artifactId>JavaWeb-02-Maven</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <name>JavaWeb-02-Maven Maven Webapp</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <dependencies>
    <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.20</version>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid</artifactId>
      <version>1.1.22</version>
    </dependency>

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.16</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>commons-dbutils</groupId>
      <artifactId>commons-dbutils</artifactId>
      <version>1.6</version>
    </dependency>

    <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>fastjson</artifactId>
      <version>1.2.71</version>
    </dependency>
  </dependencies>


</project>

```

Maven的配置

![image-20210717125204432](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210717125204432.png)

![image-20210717125401980](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210717125401980.png)

maven服务器配置:

```xml
<build>
    <finalName>maven02</finalName>
    <plugins>
        <!-- tomcat插件控制 -->
        <plugin>
            <groupId>org.apache.tomcat.maven</groupId>
            <artifactId>tomcat7-maven-plugin</artifactId>
            <version>2.2</version>
            <configuration>
                <port>8080</port> <!-- 端口号 -->
                <path>/${project.build.finalName}</path> <!-- 动态获取项目名字 -->
                <uriEncoding>UTF-8</uriEncoding>  <!--uri的编码格式 解决中文乱码问题 -->
            </configuration>
        </plugin>
        <!-- jetty插件控制 -->
        <plugin>
            <groupId>org.eclipse.jetty</groupId>
            <artifactId>jetty-maven-plugin</artifactId>
            <version>9.2.11.v20150529</version>
            <configuration>
                <httpConnector>
                    <port>8080</port>
                </httpConnector>
                <webApp>
                    <contextPath>/${project.build.finalName}</contextPath>
                </webApp>
                <!--热部署-->
                <scanIntervalSeconds>10</scanIntervalSeconds>
            </configuration>
        </plugin>
    </plugins>
</build>

```

[idea如何删除java里面工程_IntelliJ IDEA 如何彻底删除项目的步骤_weixin_39938935的博客-CSDN博客](https://blog.csdn.net/weixin_39938935/article/details/114814106)

[IDEA 2021版新建Maven、TomCat工程的详细教程_java_脚本之家](https://www.jb51.net/article/211021.htm)

[IDEA中导入多个包自动合并为星号 - PC君 - 博客园](https://www.cnblogs.com/pcheng/p/10268366.html)

[IntelliJ IDEA 连接数据库 详细过程 - 緈諨の約錠 - 博客园](https://www.cnblogs.com/summary-2017/p/10575165.html)