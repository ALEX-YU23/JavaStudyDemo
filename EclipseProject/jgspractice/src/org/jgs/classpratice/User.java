package org.jgs.classpratice;

/**
 * @Description 案例分析五
 * 设计一个表示用户的User类，类中的变量有用户名、
 * 口令和记录用户个数的变量，定义类的3个构造方法（无参、
 * 为用户名赋值、为用户名和口令赋值）、获取和设置口令
 * 的方法和返回类信息的方法。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月6日下午7:16:47
 */
class User {
    private String uid;
    private String password;
    private static int count = 0;
    public User(){
        this("NOID","bdqn");
    }
    public User(String uid){
        this(uid,"jgs2111");
    }
    public User(String uid,String password){
        this.uid = uid;
        this.password = password;
        count ++ ; // 个数追加
    }
    // setter、getter略
    public static int getCount(){ //  获得用户个数
        return count;
        
    }
    public String getInfo() {
        return "用户名："+uid+"\n密码："+password;
    }
}
