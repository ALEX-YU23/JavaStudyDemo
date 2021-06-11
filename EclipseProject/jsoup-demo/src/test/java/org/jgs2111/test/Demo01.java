package org.jgs2111.test;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * 
 *  Jsoup入门
 * @author AlexYU
 * @date 2021年6月2日下午8:22:04
 */
public class Demo01 {

	String url = "https://read.qidian.com/chapter/ytboOuS1sYT-JlVC31J8Aw2/hv8VmHn8yHROBDFlr9quQA2";
	String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36 Edg/91.0.864.37";
	@Test
	public void test01() throws IOException {
		//1. 根据url地址创建连接对象
		//userAgent:用户代理，模拟浏览器请求
		//timeout:超时时间，亳秒
		Connection connect = Jsoup.connect(url).userAgent(userAgent).timeout(Integer.MAX_VALUE);
		
		//2. 使用连接对象获取文档对象
		//get:get请求
		//post:post请求
		Document document = connect.get();
		
		System.out.println(document);
	}
	
	@Test
	public void test02() throws IOException {
		//1. 根据url地址创建连接对象
		Connection connect = Jsoup.connect(url).userAgent(userAgent).timeout(Integer.MAX_VALUE);
		
		//2. 使用连接对象获取文档对象
		Document document = connect.get();
		
		//3.通过id获取元素
		Element elementById = document.getElementById("j_bodyRecWrap");
//		System.out.println(elementById);
		
		//4.通过标签名获取多个元素
		Elements elementsByTagP = document.getElementsByTag("p");
//		System.out.println(elementsByTagP);
		
		// 5.通过class获取多个元素
		Elements elements = document. getElementsByClass("book-photo");
		for (Element element : elements) {
//			System.out.println(element);
		}
		
		// 6.通过任意属性获取多个元素
		Elements ebav = document.getElementsByAttributeValue("data-authorid","430320330");
		for (Element element : ebav) {
			System.out.println(element);
		}
	}
	
	
	@Test
	public void test03() throws IOException {
		//1. 根据url地址创建连接对象
		Connection connect = Jsoup.connect(url).userAgent(userAgent).timeout(Integer.MAX_VALUE);
		
		//2. 使用连接对象获取文档对象
		Document document = connect.get();
		
		//3.通过id获取元素
		Elements ele1 = document.select("#j_bodyRecWrap");
//		System.out.println(ele1);
		
		//4.通过标签名获取多个元素
//		Elements eleP = document.select("p");
//		System.out.println(eleP);
		
		// 5.通过class获取多个元素
//		Elements elements = document.select(".book-photo");
//		for (Element element : elements) {
//			System.out.println(element);
//		}
		
		// 6.通过任意属性获取多个元素"data-authorid","430320330"
		Elements ebav = document.select("[data-authorid='430320330']");
		for (Element element : ebav) {
			System.out.println(element);
		}
	}
}
