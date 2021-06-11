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

public class Crawler01 {

	static String url = "https://read.qidian.com/chapter/ytboOuS1sYT-JlVC31J8Aw2/hv8VmHn8yHROBDFlr9quQA2";
	
	static String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36 Edg/91.0.864.37";
	
	static String tarGetDir = "D:\\TempDir\\起点\\";
	
	public static void main(String[] args) throws IOException {
		
		//1. 根据url地址创建连接对象
		
		Connection connect = Jsoup.connect(url).userAgent(userAgent).timeout(Integer.MAX_VALUE);
		//2. 使用连接对象获取文档对象
		Document document = connect.get();
		
		//3.获取小说名字
		String name = document.select(".book-cover-wrap h1").get(0).text();
		String author = document.select(".book-cover-wrap h2 a").get(0).text();
		System.out.println(name+":"+author);
		
		//4.创建小说目录
		File file = new File("《"+name+"》"+"作者:"+author);
		file.mkdir();
		System.out.println(file.exists());
		
//		//4.获取小说封面
//		Elements photoE = document.select(".book-photo img");
//		String photohttp = "http:"+ photoE.attr("src");
//		FileUtils.copyURLToFile(new URL(photohttp), new File(tarGetDir+titile+"//"+titile+".jpg"));

	}

}
