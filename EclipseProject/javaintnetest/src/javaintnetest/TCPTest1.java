package javaintnetest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * 实现TCP的网络编程
 * 例子1:客户端发送信息给服务端，服务端将数据显示在控制台上
 * 
 */
public class TCPTest1 {

	@Test
	public void client() {
		Socket scoket = null;
		OutputStream os = null;
		try {
			InetAddress inet = InetAddress.getByName("192.168.4.247");
			//1.创建Socket对象，指明服务器端的ip和端口号
			scoket = new Socket(inet,5588);
			//2.获取一个输出流，用于输出数据
			os = scoket.getOutputStream();
			//3.写出数据的操作
			os.write("我可去你的吧".getBytes());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			//4.资源的关闭
			if (os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (scoket!=null) {
				try {
					scoket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void server(){
		// 新建一个服务器Socket
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			//1.创建服务器端的ServerSocket,指明自己的端口号
			ss = new ServerSocket(5588);
			//2.调用accept()表示接收来自于客户端的socket
			socket = ss.accept();
			//3.获取输入流
			is = socket.getInputStream();
			
			
			//4.读取输入流中的数据
			baos = new ByteArrayOutputStream();
			byte[] buff = new byte[25];
			int len;
			while ((len=is.read(buff))!=-1) {
				// 写到数组流里头
				baos.write(buff,0,len);
			}
			System.out.println("收到来自于的"+socket.getInetAddress().getHostAddress()+"数据");
			System.out.println(baos.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//5.关闭资源
			if (baos!=null) {
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (ss!=null) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
