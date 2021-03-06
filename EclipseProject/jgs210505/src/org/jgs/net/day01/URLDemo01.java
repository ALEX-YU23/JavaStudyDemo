package org.jgs.net.day01;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * URL 统一资源定位符
 * http://www.zhangsan.com:8080/java/java基础.html
 * 
 * @author mosin
 * @DATE 2021年6月1日
 */
public class URLDemo01 {

	public static void main(String[] args) {
		
		//创建url的实例对象
		try {
			URL url = new URL("http://www.zhangsan.com:8080/java/java基础.html");
			//调用url中的相关方法  
			String host = url.getHost();
			System.out.println(host);
			//获取端口号
			int port = url.getPort();
			System.out.println(port);
			
			//url加密操作  解决中文和特殊字符在传输时乱码的问题
			String encode = URLEncoder.encode("http://www.zhangsan.com:8080/java/java基础.html");
			System.out.println(encode);
			//url解密操作  
			String decode = URLDecoder.decode(encode);
			
			System.out.println(decode);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
