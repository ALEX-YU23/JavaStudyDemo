package org.jgs.Stringdemo.day01;

import java.util.Arrays;

import org.junit.Test;

/**
 * 截取网址的域名http://www.baidu.com      http://www.jd.gov.cn
 * @author mosin
 * @DATE 2021年5月18日
 */
public class StringDemo02 {
	@Test
	public void test01() {//截取域名
		
		String str = "http://www.taobao.com";
		//第一个点在字符串中的索引
		int start = str.indexOf(".");
		System.out.println(start);
		////第二个点在字符串中的索引 从第一个点位置之后开始找
		int end = str.indexOf(".",start+1);
		System.out.println(end);
		
		//截取子串[start,end)
		String sub = str.substring(start+1, end);
		System.out.println(sub);

	}
	
	@Test
	public void test02() {//判断字符串是不是回文
		
		String str = "上海自来水来自海上";
		boolean flag = true; // 开关法
		for (int i = 0; i < str.length()/2; i++) {
			
			if(str.charAt(i)==(str.charAt(str.length()-1-i))) {
				
				continue;
				
			}else {
				flag =false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}

	}
	
	@Test
	public void test03() {//正则表达式的使用
		/*
		 * 正则表达式指的就是字符串的格式用于验证字符串的内容是否满足格式的标准
		 * 只检查格式不检查有效性
		 *	
		 * 正则表达式相关的语法：参见笔记
		 *
		 *
		 *使用正则表达式编写一个邮箱的正则
		 *
		 *[a-zA-Z0-9]+
		 *\w+@\w+(\.[a-z]+)+
		 * */
		
		String emial = "mengshun@139.cn";
		// \在java中有指代意义 转义 \w  \\w
		String reg = "\\w+@\\w+(\\.[a-z]+)+";
		
		boolean matches = emial.matches(reg);
		System.out.println(matches);
		
	}
	
	
	@Test
	public void test04() {//编写手机号码的正则表达式
		
		// ^1[3-9][0-9]{9}$
		String reg = "^1[3-9][0-9]{9}$";
		String tel = "13212250803";
		
		boolean matches = tel.matches(reg);
		System.out.println(matches);
		
		
	}
	
	@Test
	public void test05() { //使用正则拆分字符串
		String str = "abc1lkj123lkjgvg34kkjh56bgg";
		String reg = "[0-9]+";
		
		
		String[] split = str.split(reg);
		//拆分后的字符串数组是不包含拆分字符的
		System.err.println(Arrays.toString(split));
		//按照正则进行字符的替换
		String replaceAll = str.replaceAll(reg,"#");
		System.out.println(replaceAll);
		
	}
	
	@Test
	public void test06() {
		/*StringBuffer和StringBuilder
		 * 1.字符串的缓冲区/字符换的创建者
		 * 2.StringBuffer  线程安全的  多线程时执行的效率较差  1.0
		 * 3.StringBuilder 线程不安全的 执行的效率较高  	   1.5dka
		 * 
		 * 如何创建StringBuilder对象
		 * 1.StringBuilder()
		 * 2.StringBuilder(String str)
		 * **/
		
		//创建了一个空的字符串
//		StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		String  str2 = "hello";
		//
		StringBuilder sb2 = new StringBuilder(str2);
		//添加内容到空串
		//StringBuilder append = sb.append("good good study");
		sb.append("good good study");
		System.out.println(sb);
		//System.out.println(append);
		//System.out.println(append==sb);
		
		//替换某些字符
		sb.replace(0, 1, "G");
		System.out.println(sb);
		
		
		//插入字符到指定位置
		sb.insert(sb.length(), ",day day up");
		System.out.println(sb);
		
		//删除字符
		sb.delete(0, 4);
		System.out.println(sb);
		
		//获取StringBuilder封装的值
		String str = sb.toString();
		System.out.println(str+1);

		
		for (int i = 0; i < 100000000; i++) {
			sb.append("a");
		}
		System.out.println("结束");
		
	}
	

}
