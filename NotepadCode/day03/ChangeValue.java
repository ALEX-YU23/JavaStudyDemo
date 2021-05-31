/*

交换两个变量值的代码的实现

*/



class ChangeValue{
	public static void main(String[] args) {
		
		
		int num1 = 3,num2 = 9;
		System.out.println("num1 = "+num1+" num2 = "+num2);

		int num3;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("num1 = "+num1+" num2 = "+num2);

	}
}
