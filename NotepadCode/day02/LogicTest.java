/*
运算符之四：逻辑运算符
&   &&   |   ||   !   ^

说明：
1.逻辑运算符操作的都是boolean类型的变量






*/




class LogicTest {
	public static void main(String[] args) {
		/*
		
		区分&  与   &&
		相同点1：&  和  && 的运算结果相同
		相同点2：当符号左边是true时，二者都会执行符号左边的
		运算
		不同点：当符号左边为false时，&继续执行符号右边的运算。


		*/
		boolean b1 = true;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		System.out.println("num1:" + num1);
		
		boolean b2 = true;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("我现在在西京");
		}else{
			System.out.println("我现在在东京");
		}
		System.out.println("num2:" + num2);
		
System.out.println();
System.out.println();

		/* 
		区分： |  与   ||
		相同点1：|  和  || 的运算结果相同
		相同点2：当符号左边是false时，二者都会执行符号左边的
		运算
		不同点：当符号左边为true时，&继续执行符号右边的运算。
		开发中推荐短路的 
		*/

		boolean b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		System.out.println("num3 = "+ num3);



		boolean b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		System.out.println("num4 = "+ num4);



	}
}
