package org.intelnet.urlteacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	private ServerSocket server;
	
	/*
	 * 创建数组 共享输出流
	 */
	private PrintWriter[] allOut = {};
	
	/**
	 * 初始化服务器  ServerSocket(int port)  
	 */
	public Server() {
		
		try {
			System.out.println("服务端开始初始化...");
			server = new ServerSocket(8088);
			System.out.println("服务端初始化完成...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 服务器端具体做的任务
	 * 
	 */
	public void start() {
		
		//监听端口  accept() 阻塞方法  等待客户端的连接  
		
		try {
			
			while(true) {
				System.out.println("等待客户端连接....");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				
				//创建线程 处理连接
				ClientHandler clientHandler = new ClientHandler(socket);
				Thread thread = new Thread(clientHandler);
				thread.start();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	
	private class ClientHandler implements Runnable {
		
		private Socket socket;
		private String host;
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//获取客户端的信息
			InetAddress inetAddress = socket.getInetAddress();
			host = inetAddress.getHostAddress();
		}
		@Override
		public void run() {
			System.out.println("启动一个线程，处理客户端的信息");
			PrintWriter pw= null;
			BufferedReader br = null;
			try {
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
				
				//写出数据到客户端
				OutputStream os = socket.getOutputStream();
				//将字节流 转为字符流 方便写出中文
				OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
				//将字符流转为字符缓冲流 提高效率 
				BufferedWriter bw = new BufferedWriter(osw);
				//使用有自动行刷新功能的流写出
				pw = new PrintWriter(bw,true);
				
				//扩容数组   存入最后一个位置
				synchronized (allOut) {
					allOut = Arrays.copyOf(allOut, allOut.length+1);
					allOut[allOut.length-1] = pw;
				}
				//循环的读取 客户端的消息
				String msg =null;
				while((msg=br.readLine())!=null) {
					System.out.println(host+"说:"+msg);
					//遍历数组  写出给所有人
					//pw.println("服务端说:"+msg);
					
					//遍历数组  写出给所有人
					synchronized (allOut) {
						for (PrintWriter printWriter : allOut) {
							printWriter.println(msg);
						}
					}
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				//处理客户端断开连接的操作
				//移出该连接的输出流
				for (int i = 0; i < allOut.length; i++) {
					if(allOut[i]==pw) {
						allOut[i] = allOut[allOut.length-1];
						break;
					}
				}
				
				allOut = Arrays.copyOf(allOut, allOut.length-1);
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
}
