package org.jgs.stringtest;

import org.junit.Test;

public class Demo02 {

	@Test
	/**
	 * 1）模拟一个trim方法，去除字符串两端的空格。
	 * @Description
	 * @author AlexYU 
	 * @date 2021年5月17日下午7:58:10
	 */
	public void test01() {
		
		String str = "   三 女 nidvvv   orfja 女  包       ";
		
		System.out.println(trim(str));
	}
	
	public String trim(String str) {
		char[] charArray = str.toCharArray();
		int startindex = 0;
		int endindex = charArray.length;
		while (charArray[startindex]==' ') {startindex++;}
		while (charArray[endindex-1]==' ') {endindex--;}
		return str.substring(startindex, endindex);
	}
	
	/**
	 * 2）将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
	 * @Description															abfedcg
	 * @author AlexYU 
	 * @date 2021年5月17日下午7:58:10
	 */
	public String reverse(String str) {
		
		char[] newarr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			newarr[str.length()-i-1]=str.charAt(i);
		}
		String newstr = String.valueOf(newarr);
		return newstr;
	}
	
	public String reverse(String str,int offset,int endset) {
		
		String substr = str.substring(offset, endset+1);
		String reverse = reverse(substr);
		
		String newstr = str.replace(substr, reverse);
		return newstr;
	}
	@Test
	public void test02() {
					// 	 0123456
		String string = "abcdefg";
		String reversestr = reverse(string,2,5);
		System.out.println(reversestr);
		
	}
	/**
	 * 3）获取一个字符串在另一个字符串中出现的次数。
	 * 比如：获取“ ab”在 “abkkabcadkabkebfkabkskab” 中出现的次数
	 */
	@Test
	public void test03() {
		String str = "kkcadkabkebfkabksk";
		String fStr = "ab";
		System.out.println(countEle(str,fStr));;
	}
	public int countEle(String str,String element) {
		String[] split = str.split(element);
		if (str.startsWith(element)||str.endsWith(element)) {
			return split.length;
		}
		return split.length-1;
	}
	/**
	 * 4）手机号的正则表达式
	 * 
	 * [1][^012]\d{9}
	 * 
	 */
	@Test
	public void test04() {
		String phoneNum = "131455253271";
		String phoneRegx ="^[1][^012]\\d{9}$";
		
		boolean matches = phoneNum.matches(phoneRegx);
		System.out.println(matches);
		
	}
	
	
}
