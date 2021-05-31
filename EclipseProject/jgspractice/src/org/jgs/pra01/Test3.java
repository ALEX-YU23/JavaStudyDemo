package org.jgs.pra01;

/**
 * @Description 3、编写程序,统计出字符串 "want you to know one thing"中字母n和字母o的出现次数。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月28日上午9:50:57
 */


class StrUtil{
	public static int sumletter(String str, char a) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==a) {
				sum ++;
			}
		}
		return sum;
	}

}

public class Test3 {

	public static void main(String[] args) {
		String str = "want you to know one thing";
		char a = 'n';
		int sum_n = StrUtil.sumletter(str, a);
		System.out.println("出现字母"+a+"的次数为："+sum_n);
		int sum_o = StrUtil.sumletter(str, 'o');
		System.out.println("出现字母"+'o'+"的次数为："+sum_o);
	}
	
	
}
