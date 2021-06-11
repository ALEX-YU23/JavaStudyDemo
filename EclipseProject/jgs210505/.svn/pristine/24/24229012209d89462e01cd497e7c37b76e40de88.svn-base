package org.jgs.xml.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/**
 * 使用dom4j解析xml文档
 * - 1.导包  dom4j.jar
- 	 2.创建SAXReader对象
-    3.获取文档的dom树
-    4.通过相关方法 获取每个子节点 及其内容
 * 
 * @author mosin
 * @DATE 2021年6月3日
 */
public class XmlTest {
	
	@Test
	public void test01() { // 解析xml文件
		
		try {

			//创建Saxreader对象
			SAXReader saxReader = new SAXReader();
			//d读取xml文件 生成dom树
			Document doc = saxReader.read(new FileInputStream("students.xml"));
			//通过文档对象 解析 xml  获取节点  获取节点中的值
			//获取根节点
			Element rootElement = doc.getRootElement();
			System.out.println(rootElement.getName());
			
			//获取根节点下的所有的子节点
			List<Element> elements = rootElement.elements();
			for (Element element : elements) {
				List<Element> elements2 = element.elements();
				for (Element  ele : elements2) {
					System.out.println(ele.getName());
				}
				System.out.println("****************************");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void test02() { // 解析xml文件  获取标签的内容
		try {

			//创建Saxreader对象
			SAXReader saxReader = new SAXReader();
			//d读取xml文件 生成dom树
			Document doc = saxReader.read(new FileInputStream("students.xml"));
			//通过文档对象 解析 xml  获取节点  获取节点中的值
			//获取根节点
			Element rootElement = doc.getRootElement();
			//获取根节点下的所有的子节点
			List<Element> elements = rootElement.elements();
			for (Element element : elements) {
				//element <student>  -> <name>
				Element elename= element.element("name");
				String name = elename.getText();
				//System.out.println("name:"+name);
			
				Element eleage= element.element("age");
				String age = eleage.getText();
				//System.out.println("age:"+age);
				
				Element elescore= element.element("score");
				String score = elescore.getText();
				//System.out.println("score:"+score);
				
				Stu stu = new Stu(Integer.parseInt(age),Double.parseDouble(score),name);
				System.out.println(stu);
				System.out.println("**********************");
				
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
	@Test
	public void test03() { // 解析xml文件  获取标签的内容 方式2
		try {

			//创建Saxreader对象
			SAXReader saxReader = new SAXReader();
			//d读取xml文件 生成dom树
			Document doc = saxReader.read(new FileInputStream("students.xml"));
			//通过文档对象 解析 xml  获取节点  获取节点中的值
			//获取根节点
			Element rootElement = doc.getRootElement();
			//获取根节点下的所有的子节点
			List<Element> elements = rootElement.elements();
			for (Element element : elements) {
				
				String name = element.elementText("name");
				String age = element.elementText("age");
				String score = element.elementText("score");
				//封装数据到 学生对象
				Stu stu = new Stu(Integer.parseInt(age),Double.parseDouble(score),name);
				System.out.println(stu);
				System.out.println("**********************");
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test04() { // 解析xml文件  获取标签的属性和属性值
		
		try {
			//创建Saxreader对象
			SAXReader saxReader = new SAXReader();
			//d读取xml文件 生成dom树
			Document doc = saxReader.read(new FileInputStream("students.xml"));
			//通过文档对象 解析 xml  获取节点  获取节点中的值
			//获取根节点
			Element rootElement = doc.getRootElement();
			//获取根节点下的所有的子节点
			List<Element> elements = rootElement.elements();
			for (Element element : elements) {
				//获取标签的属性
//				Attribute attribute = element.attribute("id");
//				String value = attribute.getValue();
				String value = element.attributeValue("id");
				System.out.println(value);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  1.创建一个Document对象，表示一个空白文档

		2.向Document中添加根元素

		3.按照XML文档结构从根标签开始逐级添加子标签及对应数据

		4.创建Xmlwriter，使用xmlwriter写出Document以生成文档
	 */
	@Test
	public  void  test05() { //写出数据到 xml文件
		
		ArrayList<Stu> students = new  ArrayList<Stu>();
		
		students.add(new Stu(20,88,"张三"));
		students.add(new Stu(30,82,"李四"));
		students.add(new Stu(40,80,"王五"));
		students.add(new Stu(50,74,"赵六"));
		
		//创建空白文档
		Document doc = DocumentHelper.createDocument();
		//添加根标签 到文档
		Element root = doc.addElement("students");
		
		//遍历集合 创建子标签
		for (Stu stu : students) {
			Element addElement = root.addElement("student");
			//继续添加子标签  name  age  score
			Element addElement2 = addElement.addElement("name");
			//添加文本到标签
			addElement2.addText(stu.getName());
			
			Element addage = addElement.addElement("age");
			//添加文本到标签
			addage.addText(stu.getAge()+"");
			
			Element addscore = addElement.addElement("score");
			//添加文本到标签
			addscore.addText(stu.getScore()+"");
		}

		try {
			//获取XMLWriter 对象 将doc文档写出 
			XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("stus.xml"),OutputFormat.createPrettyPrint());
			xmlWriter.write(doc);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
