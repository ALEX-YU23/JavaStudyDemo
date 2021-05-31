package org.jgs.oop.day08;
/*
 * jdk8以后 接口中允许有
 * 默认的方法   default修饰    可以有多个  
 * 静态的方法   public static修饰    public可以省略  可以有多个
 * 
 */
public interface PhonePlus2 {
	
	void NFC();
	//可以被继承
	default void ray(){
		System.out.println("当前手机具有红外线的功能 ");
	};
	
	//接口中允许出现静态的方法  static
     public static void test() {
    	 System.out.println("接口中的静态方法");
     };
//     public static void test2() {
//    	 System.out.println("接口中的静态方法");
//     };
     
  
	
}
