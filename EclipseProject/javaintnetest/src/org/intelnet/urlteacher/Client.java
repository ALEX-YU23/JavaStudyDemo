package org.intelnet.urlteacher;
/**
 * 
 * @author AlexYU
 * @date 2021年6月1日下午1:39:11
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	private  Socket socket;
	
	/**
	 * 无参构造器 完成 客户端的初始化工作 
	 * Socket(ip, port)
	 * localhost：本地 地址  等同于127.0.0.1 通过IP地址可以找到服务器端的计算机
	 * 8080：端口号  通过端口号可以找到计算机中的应用程序
	 * 端口的取值范围是:0-65535  一般0不使用  
	 * 
	 * 实例化的过程  即是连接的过程
	 */
	public Client() {
		
		try {
			System.out.println("正在连接服务端......");
			socket = new Socket("localhost", 8088);
			System.out.println("服务器连接成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 该方法用于完成整个通信过程的任务
	 */
	
	public void start() {
		
		//通过socket 实现和服务器的通信
		try {
			
			serverHandler serverHandler = new serverHandler();
			new Thread(serverHandler).start();
			
			OutputStream os = socket.getOutputStream();
			//将字节流 转为字符流 方便写出中文
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			//将字符流转为字符缓冲流 提高效率 
			BufferedWriter bw = new BufferedWriter(osw);
			//使用有自动行刷新功能的流写出
			PrintWriter pw = new PrintWriter(bw,true);
			
			//创建扫描器  不断向服务器端发送消息
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String msg = scanner.nextLine();
				pw.println(msg);
//				//读取服务端的信息 打印
//				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 完成客户端的启动，实现和客户端的牵手，并开始工作
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		client.start();
		
	}
	
	//创建一个类 实现客户端的读写分离
	
	private class serverHandler implements Runnable{

		@Override
		public void run() {
			
			try {
				InputStream inputStream = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(inputStream,"utf-8");
				BufferedReader br = new BufferedReader(isr);
				String str = null;
				while((str=br.readLine())!=null) {
					System.out.println(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
