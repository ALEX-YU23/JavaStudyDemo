package org.jgs.net.day01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * DatagramSocket    基于UDP协议的传输类  封装了udp传输的细节
 * 构造方法
 * DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
 * DatagramSocket(int port) 构造数据报套接字并将其绑定到本地主机上的指定端口


 * @author mosin
 * @DATE 2021年6月1日
 */
public class DatagramSocketDemo01 {

	
	public static void main(String[] args) {
		
	  try {
		  //数据报
		 DatagramSocket ds= new DatagramSocket(6666);
		 /*在数据发送之前 必须进行数据的封装  把数据封装成一个数据报包
		  * DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
			构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号
		  * */
		String msg = "hello udp";
		byte[] bs = msg.getBytes();
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket dp = new  DatagramPacket(bs,bs.length,ip,8888);
		
		//使用数据报发送数据
		ds.send(dp);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		
	}
	
	
	
}
