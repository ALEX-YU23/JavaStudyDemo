package org.jgs.stringtest;

import org.junit.Test;

public class Demo01 {

	@Test
	/**
	 * 
	 * @Description 1.截取网址的域名http://www.baidu.com       http://www.baidu.com.cn
	 * @author AlexYU 
	 * @date 2021年5月17日上午11:36:48
	 */
	public void test01() {
		String url = "https://search.bilibili.com";
		
		String[] urlsplit = url.split("\\.");
		
		System.out.println("域名是："+urlsplit[1]);
//		for (String str : urlsplit) {
//			System.out.println(str);
//		}
	}
	@Test
	/**
	 * 
	 * @Description 2.判断文字是否是回文（上海自来水来自海上）
	 * @author AlexYU 
	 * @date 2021年5月17日上午11:36:48
	 */
	public void test02() {
		String palindrome = "上海自来水水来自海上";
		boolean flag = true;
		for (int i = 0; i < palindrome.length()/2; i++) {
			char chH = palindrome.charAt(i);
			char chR = palindrome.charAt(palindrome.length() - i - 1);
			if(chH!=chR) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(palindrome+"     是：回文");
		}else {
			System.out.println(palindrome+"     不是：回文");
		}
		
	}
	@Test
	public void test03() {
		String palindrome = "上海上自来水来自上海上";
		boolean flag = true;
		for (int i = 0; i < palindrome.length()/2; i++) {
			int idxH = palindrome.indexOf(palindrome.charAt(i));
			int idxR = palindrome.lastIndexOf(palindrome.charAt(i));
			if((idxH+idxR)!=(palindrome.length()-1)) {
				flag = false;
				break;
			}
		
		}
		if (flag) {
			System.out.println(palindrome+"     :是回文");
		}else {
			System.out.println(palindrome+"     :不是回文");
		}
		
	}

}
