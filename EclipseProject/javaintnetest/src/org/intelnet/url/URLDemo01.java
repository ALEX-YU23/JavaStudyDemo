package org.intelnet.url;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo01 {
	public static void main(String[] args) {
		// 创建URL实例对象
		try {
			URL url = new URL("https://zhuanlan.zhihu.com/p/63557371");
			// 调用URL中的方法 
			String host = url.getHost();
			System.out.println(host);
			// 获取端口号
			int port = url.getPort();
			System.out.println(port);
			
			URLConnection oc = url.openConnection();
			InputStream inputStream = oc.getInputStream();
			
			BufferedInputStream bis = new BufferedInputStream(inputStream);
			FileOutputStream fos = new FileOutputStream(new File("躺平学.html"));
			
			byte[] buff = new byte[1024];
			int len ;
			while ((len=bis.read(buff))!=-1) {
				fos.write(buff, 0, len);
				System.out.println(new String(buff, 0, len));
			}
			fos.close();
			bis.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
