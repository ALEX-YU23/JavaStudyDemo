package org.jgs2111.demo;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 获取图片资源
 * @author AlexYU
 * @date 2021年6月2日下午9:06:37
 */
public class Demo02 {
	
	static String url = "https://read.qidian.com/chapter/ytboOuS1sYT-JlVC31J8Aw2/hv8VmHn8yHROBDFlr9quQA2";
	
	static String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36 Edg/91.0.864.37";
	
	static String tarGetDir = "D://TempDir//起点//";
	
	public static void main(String[] args) throws IOException {
		
		//1. 根据url地址创建连接对象
		Connection connect = Jsoup.connect(url).userAgent(userAgent).timeout(Integer.MAX_VALUE);
		//2. 使用连接对象获取文档对象
		Document document = connect.get();
		// 获取小说标题
		//3. 获取第一章小说内容
		Elements ps = document.select(".read-content p");
		// 4.遍历获取文本内容

		for (Element p : ps) {
			FileUtils.writeStringToFile(new File(tarGetDir+"1.txt") ,p.text()+"\n","utf-8" ,true);
		}
		System.out.println("起一张");
	}

}
