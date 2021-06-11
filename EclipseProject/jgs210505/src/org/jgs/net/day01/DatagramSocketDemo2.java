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
public class DatagramSocketDemo2 {

	
	public static void main(String[] args) {
		
	  try {
		  //数据报
		 DatagramSocket ds= new DatagramSocket(8888);
		 /*DatagramPacket(byte[] buf, int length)  	
		  *构造一个 DatagramPacket用于接收长度的数据包 length 
		  */
		byte[] bs =  new byte[1024];
		DatagramPacket dp = new DatagramPacket(bs,bs.length);
		
		//接收数据    阻塞 监听8888端口
		ds.receive(dp);
		System.out.println("客户端发来的数据是:"+new String(bs));
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
	
	
	
}
