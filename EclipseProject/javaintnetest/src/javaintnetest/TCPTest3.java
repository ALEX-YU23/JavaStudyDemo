package javaintnetest;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
 * 例题3:从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。
 * 并关闭相应的连接。
 */
public class TCPTest3 {

	@Test
	public void client() {
		Socket scoket = null;
		OutputStream os = null;
		InputStream is = null;
		FileInputStream fis = null;
		ByteArrayOutputStream baos = null;
		try {
			InetAddress inet = InetAddress.getByName("192.168.4.247");
			//1.创建Socket对象，指明服务器端的ip和端口号
			scoket = new Socket(inet,5588);
			//2.获取一个输出流，用于输出数据
			os = scoket.getOutputStream();
			fis = new FileInputStream("小姐姐.jpg");
			//3.写出数据的操作
			byte[] buff = new byte[1024];
			int len ;
			while ((len=fis.read(buff))!=-1) {
				os.write(buff, 0, len);
			}
			// 告诉服务器图片传输完毕
			scoket.shutdownOutput();
			//4.接收来自于服务器端的数据，并显示到控制台上
			is = scoket.getInputStream();
			baos = new ByteArrayOutputStream();
			buff=new byte[1024];
			while ((len=is.read(buff))!=-1) {
				baos.write(buff, 0, len);
			}
			System.out.println(baos.toString());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			//6.资源的关闭
			if (baos!=null) {
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis!=null) {
				try {
					fis.close();
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
		OutputStream os = null;
		FileOutputStream fos = null;
		try {
			//1.创建服务器端的ServerSocket,指明自己的端口号
			ss = new ServerSocket(5588);
			//2.调用accept()表示接收来自于客户端的socket
			socket = ss.accept();
			//3.获取输入流
			is = socket.getInputStream();
			
			fos = new FileOutputStream("小姐姐_1.jpg");
			//4.读取输入流中的数据
			byte[] buff = new byte[1024];
			int len;
			while ((len=is.read(buff))!=-1) {
				// 写到数组流里头
				fos.write(buff, 0, len);
			}
			System.out.println("收到来自于的"+socket.getInetAddress().getHostAddress()+"数据");
			
			//6.服务器端给予客户端反馈
			os = socket.getOutputStream();
			os.write("你好,照片已收到".getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//5.关闭资源
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (os!=null) {
				try {
					os.close();
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
