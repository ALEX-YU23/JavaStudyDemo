package org.jgs.net.day01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * URL 统一资源定位符
 * http://www.zhangsan.com:8080/java/java基础.html
 *  通过url获取网页源码
 * @author mosin
 * @DATE 2021年6月1日
 */
public class URLDemo2 {

	public static void main(String[] args) {
		
		//创建url的实例对象
		try {
			URL url = new URL("https://www.163.com/");
			//打开连接
			URLConnection oc = url.openConnection();
			
			//获取字节输入流 读取服务器返回的数据
			InputStream is = oc.getInputStream();
			//创建字节类型的数组 加快读写的效率
			byte[] bs = new byte[1024];
			
			FileOutputStream fos = new FileOutputStream("E:/163.html");
			int len = -1;
			while((len = is.read(bs))!=-1) {
				fos.write(bs,0,len);
			}
			
			//关闭流 释放资源
			fos.close();
			is.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
