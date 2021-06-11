package org.intelnet.url3;
/**
 * 服务器类:
 * 1.构造器初始化服务器
 * 2.start()类负责执行主体代码
 * 3.一个线程类负责处理来自服务器的信息,分别是读和写
 * 4.main()方法负责启动服务器
 * @author AlexYU
 * @date 2021年6月1日下午7:41:00
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket ss;

	//1.构造器初始化服务器
	public Server() {
		try {
			System.out.println("服务器开始启动...");
			ss = new ServerSocket(8887);
			System.out.println("服务器启动成功...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//2.start()类负责执行主体代码
	public void start() {
		
		while (true) {
			System.out.println("等待客户端连接....");
			try {
				Socket socket = ss.accept();
				System.out.println("一个客户端连接了！");
				new Thread(new ClientHandler(socket)).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//4.main()方法负责启动服务器
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	//3.一个线程类负责处理来自服务器的信息,分别是读和写
	private class ClientHandler implements Runnable{
		
		private Socket accept;
		private String host;
		
		// 获取socket
		public ClientHandler(Socket accept) {
			this.accept = accept;
			// 获取客户端的信息
			 host = accept.getInetAddress().getHostAddress();
		}
		
		@Override
		public void run() {
			System.out.println("启动一个线程，处理客户端的信息");
			BufferedReader br = null;
			PrintWriter pw = null;
			try {
				br = new BufferedReader(new InputStreamReader(accept.getInputStream(),"utf-8"));
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(accept.getOutputStream(),"utf-8")),true);
				
				String msg = null;
				while ((msg=br.readLine())!=null) {
					String showMsg = host + "说:" + msg;
					// 显示在控制台
					System.out.println(showMsg);
					// 发送给客户端
					pw.println(showMsg);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					accept.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
//			finally {
//				if (pw!=null) {
//					pw.close();
//				}
//				if (br!=null) {
//					try {
//						br.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//				if (accept!=null) {
//					try {
//						accept.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
			
		}
	}
}
