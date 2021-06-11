package javaintnetest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程中有两个主要的问题:
 * 1.如何准确地定位网络上一台或多台主机:定位主机上的特定的应用
 * 2.找到主机后如何可靠高效地进行数据传输
 * 
 * 二、网络编程中的两个要素:
 * 		1.对应问题一: IP和端口号.
 * 		2.对应问题二:提供网络通信协议: TCP/IP参考模型(应用层、传输层、网络层、物理+数据链路层)
 * 
 * 三、通信要素一: IP和端口号
	1. IP:唯一的标识Internet. 上的计算机(通信实体)
	2.
	在Java中使用InetAddress类代表IP
	3. IP分类: IPv4和IPv6 ;万维网和局域网
	4.域名: WWw. baidu.com wWw. mi. com WWw. sina. com
	5.如何实例化InetAddress:两个方法: getByName(String host)、getLocalHost()
	6.两个常用方法: getHostName() / getHostAddress().
	7.7.端口号:正在计算机上运行的进程。
	要求:不同的进程有不同的端口号
	范围:被规定为一个16位的整数0~65535。
	8.端口号与IP地址的组合得出- -个网络套接字: Socket


 */
public class IntelNetDemo {

	public static void main(String[] args) {
		try {
			// 从ip地址获取网络地址
			InetAddress ip = InetAddress.getByName("192.168.4.247");
			System.out.println(ip);
			
			// 从域名获取网络地址
			InetAddress ip2 = InetAddress.getByName("www.baidu.com");
			System.out.println(ip2);
			
			InetAddress ip3 = InetAddress.getByName("localhost");
			System.out.println(ip3);
			
			// 获得本地网络
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);
			
			//getHostName()
			
			String hostName = ip2.getHostName();
			System.out.println(hostName);
			
			//getHostAddress()
			
			byte[] address = ip2.getAddress();
			System.out.println(address);
			
			boolean reachable = ip2.isReachable(100);
			System.out.println(reachable);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
