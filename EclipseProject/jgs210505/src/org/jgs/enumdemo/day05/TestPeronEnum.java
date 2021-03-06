package org.jgs.enumdemo.day05;

import org.junit.Test;

/*
 * 测试性别的枚举类
 */
public class TestPeronEnum {
	
	@Test
	public void test01() {
		Person person = new Person();
		person.setSex(Gender.女); //使用枚举保证数据的合理性
	
	}
	
	
	@Test
	public void test02() {
		
		Gender sex = Gender.男;
		
		//获取枚举对象的名字  返回string类型的值
		String name = sex.name();
		System.out.println(name);
		//获取枚举对象在枚举中的位置,下标从0开始
		int ordinal = sex.ordinal();
		System.out.println(ordinal);

	}
	
	
	@Test
	public void test03() {
		
		//返回的是使用有参构造生成的Gender对象
		Gender sex = Gender.女;
		String name = sex.name();
		System.out.println(name);
		
		int ordinal = sex.ordinal();
		System.out.println(ordinal);
		
		//获取对象中的属性值
		String enname = sex.getEnname();
		System.out.println(enname);
		System.out.println(sex.getIndex());
	

	}

	

}
