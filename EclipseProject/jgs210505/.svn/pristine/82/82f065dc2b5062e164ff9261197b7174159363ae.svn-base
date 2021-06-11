package org.jgs.net.day01;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * InetAddress   此类表示Internet协议（IP）地址。
 * @author mosin
 * @DATE 2021年6月1日
 */
public class InetDemo01 {

	public static void main(String[] args) {
		
		try {
			InetAddress name = InetAddress.getByName("www.baidu.com");
			//获取当前InetAddress对象中的ip地址
			System.out.println(name.getHostAddress());
			System.out.println(name.getHostName());
			System.out.println("*************");
			InetAddress[] names = InetAddress.getAllByName("www.taobao.com");
			for (InetAddress inetAddress : names) {
				System.out.println(inetAddress.getHostAddress());
			}
			System.out.println("*****************");
			InetAddress lname = InetAddress.getByName("localhost");
			System.out.println(lname);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
