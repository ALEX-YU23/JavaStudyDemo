/*
运算符之六：三元运算符
1.结构：（条件表达式）？表达式1 : 表达式2
2.说明：
① 条件表达式的结果为boolean类型
② 根据条件表达式真或假，决定执行表达式1，还是表达式2
  如果表达式为true，则执行表达式1.
  如果表达式为false，则执行表达式2.
③ 表达式1 和表达式2要求是一致的。
④ 三元运算符可以嵌套

3.
凡是可以使用三元运算符的地方，都可以改写为if-else 
反之不成立。

4.
如果程序既可以使用三元运算符，又可以使用if-else结构，
那么优先选择三元运算符。原因：简洁、执行效率高。
*/



class SanYuanTest{
	public static void main(String[] args){
		//获取两个整数的最大值
		int m = 15;
		int n = 15;

		//****************************

		int max = (m > n) ? m : n ;
		System.out.println(max);
	

		String maxStr = (m > n) ? "m大":((m == n) ? "m和n相等":"n大");
		System.out.println(maxStr);

		//****************************

		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		max = (n1 > n2)? (n1 > n3)?n1:n3 : (n2 > n3)?n2:n3;
		System.out.println(max);

	 
	}

}