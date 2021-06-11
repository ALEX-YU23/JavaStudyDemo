package org.intelnet.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocketDemo02 {

	public static void main(String[] args) throws Exception {
		
		try {
			DatagramSocket c2 = new DatagramSocket(8888);
			byte[] bs = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bs,bs.length);
			c2.receive(packet);
			byte[] buf = packet.getData();
			
			System.out.println(new String(buf));
			c2.close();
			
		} catch (SocketException e) {
		}
	}
}
