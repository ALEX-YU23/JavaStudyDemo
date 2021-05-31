package org.jgs.oop.day09;
/**
 * 内部类的使用
 * @author mosin
 * @DATE 2021年4月28日
 */
public class OutClass {
	private int a = 10;
	
	public  void  t() {
		System.out.println("OutClass t()");
	}
	//成员内部类  可以访问外部类的成员变量和方法
	public  class InnerClass{
		
		public void  test() {
			a = 20;
			System.out.println(a);
			System.out.println("InnerClass test()");
			t();
		  //局部内部类
		   class InClass{
				
			public void t2() {
				System.out.println("InClass t2()");
			}
				
		  }
		   InClass inClass = new InClass();
		   inClass.t2();
	
		}
		
	}
	
	public InnerClass getInner() {
		
		return new InnerClass();
	}
	

}
