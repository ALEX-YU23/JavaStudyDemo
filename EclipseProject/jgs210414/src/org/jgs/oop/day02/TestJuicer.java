package org.jgs.oop.day02;

public class TestJuicer {

	public static void main(String[] args) {
		//创建榨汁机对象
		Juicer juicer = new Juicer();
		//榨汁  传递参数  水果名称  
		String f =  "西瓜";  // 实参 实际参数 
		int num = 2;
		juicer.juice(num,f);
	}

}
