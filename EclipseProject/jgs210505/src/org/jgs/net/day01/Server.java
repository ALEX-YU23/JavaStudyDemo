package org.jgs.net.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.jgs.net.day01.Server.ClientHandler;

/**
 * ServerSocket  服务端的套接字  
 * 192.168.4.149
 * @author mosin
 * @DATE 2021年6月1日
 */
public class Server {
	private  ServerSocket serverSocket;
	
	//初始化服务器
	public Server() {
		try {
			System.out.println("初始化服务器....");
			serverSocket = new ServerSocket(8888);
			System.out.println("服务器启动成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//服务器具体执行的操作
	public void start() {
		try {
				
			while(true) {
				System.out.println("等待客户端的连接....");
				 //开始监听8888端口  进入阻塞状态
				 Socket socket = serverSocket.accept();
				 System.out.println("一个客户已连接....");
				 //创建任务的实例
				 Runnable clientHandler = new ClientHandler(socket);
				 new Thread(clientHandler).start(); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//启动服务器
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	//创建一个任务  实现数据的读取
	class ClientHandler implements Runnable{
		private Socket socket;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				//获取字节输入流  读取客户端发送的数据
				 InputStream is = socket.getInputStream();
				 //转换字节输入流为字符输入流  方便中文的读取
				 InputStreamReader isr = new  InputStreamReader(is);
				 //转换成字符缓冲流  提高读取的效率
				 BufferedReader br = new BufferedReader(isr);
				 
				 InetAddress inetAddress = socket.getInetAddress();
				 String ip = inetAddress.getHostAddress();
				 
				 
				 String readLine = null;
				 while((readLine=br.readLine())!=null) {
					 System.out.println(ip+"说:"+readLine); 
				 } 
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
}
