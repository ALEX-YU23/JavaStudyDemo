package org.intelnet.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramSocketDemo01 {

	public static void main(String[] args) throws Exception {
		
		try {
			DatagramSocket c1 = new DatagramSocket(6666);
			String str ="你好 我是客户端";
			DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("localhost"), 8888);
			
			c1.send(datagramPacket);
			c1.close();
			
		} catch (SocketException e) {
		}
	}
}
