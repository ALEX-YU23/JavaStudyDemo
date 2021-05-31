package org.jgs.oop.day03;
/**
 * 1.静态变量  有static修饰     属于类本身    存储在方法区     只有一份   通过类名访问

​   2.实例变量 没有static修饰     属于对象      存储在堆里面      多份     对象名访问
 * @author mosin
 * @DATE 2021年4月19日
 */
public class TestAoo {

	public static void main(String[] args) {
		//实例变量a  对象名.属性名
		Aoo aoo = new Aoo();
		//System.out.println(aoo.a);
		aoo.show();
		System.out.println("************************");
		Aoo aoo2 = new Aoo();
		aoo2.show();
		
		System.out.println("************************");
		Aoo aoo3 = new Aoo();
		aoo3.show();
		
		
		//静态变量b  属于类本身  类名.属性名   对象名.属性名
//		System.out.println(Aoo.b);
//		System.out.println(aoo.b);
		//通过类名访问实例变量  不允许
		//System.out.println(Aoo.a);
		
		
	}

}
