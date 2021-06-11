package org.intelnet.url;

import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;

public class URLDemo02 {

	@Test
	public void test01() throws MalformedURLException {
		// url加密
		String url1 = "http://www.zhangsan.com:8080/java/java基础.html";
		String url2 = "http://www.dxy.com:80/hhh.html";
		String urlEncoder = URLEncoder.encode("http://www.dxy.com:80/hhh.html");
		System.out.println(urlEncoder);
		
		// url解密
		String decode = URLDecoder.decode(urlEncoder);
		System.out.println(decode);
	}
}
