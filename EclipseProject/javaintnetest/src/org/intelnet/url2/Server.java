package org.intelnet.url2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  {

	private ServerSocket ss;
	
	public Server() {
		try {
			ss = new ServerSocket(8887);
			
			System.out.println("服务器启动成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		try {
			while (true) {
				
				// 开始监听8889端口
				System.out.println("等待客户端的连接....");
				Socket accept = ss.accept();
				System.out.println("一个客户端已经链接....");
				// 创建线程处理连接
				new Thread(new ClientHandler(accept)).start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private class ClientHandler implements Runnable{

		private Socket socket;
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			// 获取客户端的信息
			this.host = socket.getInetAddress().getHostAddress();
		}
		
		@Override
		public void run() {
			
			BufferedReader br = null;
			PrintWriter pw= null;
			try {
				// 获取客户端输入流
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
				// 创建服务器输出流
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
				
				String msg = null;
				
				while ((msg = br.readLine())!=null) {
					// 打印客户端的消息
					System.out.println(host+"说:"+msg);
					// 将消息发回客户端
					pw.println(msg);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					socket.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Server sever = new Server();
		sever.start();
	}
}










