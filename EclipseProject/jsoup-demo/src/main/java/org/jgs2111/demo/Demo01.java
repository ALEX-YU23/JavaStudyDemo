package org.jgs2111.demo;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * 获取图片资源
 * @author AlexYU
 * @date 2021年6月2日下午9:06:37
 */
public class Demo01 {
	
	static String url = "https://read.qidian.com/chapter/ytboOuS1sYT-JlVC31J8Aw2/hv8VmHn8yHROBDFlr9quQA2";
	
	static String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36 Edg/91.0.864.37";
	
	static String tarGetDir = "D://TempDir//起点//";
	
	public static void main(String[] args) throws IOException {
		
		//1. 根据url地址创建连接对象
		Connection connect = Jsoup.connect(url).userAgent(userAgent).timeout(Integer.MAX_VALUE);
		//2. 使用连接对象获取文档对象
		Document document = connect.get();
		//3. 获取小说封面
		Elements bookPhoto = document.select(".book-photo>img");
		//<img src="//bookcover.yuewen.com/qdbimg/349573/1026067082/180">

		//4. 获取图片地址
//		String[] split = bookPhoto.toString().split("\"");
//		String bookPhotoUrl = "http:" + split[1];
//		System.out.println(bookPhotoUrl);
		
		String src = bookPhoto.attr("src");
		// //bookcover.yuewen.com/qdbimg/349573/1026067082/180

		//5. 使用url地址下载图片
		FileUtils.copyURLToFile(new URL("http:"+src), new File(tarGetDir+"photo.jpg"));
	}

}
