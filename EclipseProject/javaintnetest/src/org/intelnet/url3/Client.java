package org.intelnet.url3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端类:
 * 1.构造器初始化
 * 2.start()方法执行,向服务器发送信息且显示服务器传回来的信息
 * 3.创建一个线程实现显示服务器传回来的信息
 * 4.main()启动客户端
 * 
 * @author AlexYU
 * @date 2021年6月1日下午8:10:53
 */
public class Client {

	private Socket socket = null;
	
	public Client() {
		System.out.println("客户端启动中...");
		try {
			socket = new Socket("localhost",8887);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("开始向服务器发送消息...");
	}
	
	//3.创建一个线程实现显示服务器传回来的信息
	private class ServerHandler implements Runnable{

		@Override
		public void run() {

			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
				
				String msg = null;
				while ((msg=br.readLine())!=null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//2.start()方法执行,向服务器发送信息且显示服务器传回来的信息
	public void start() {
		
		//显示服务器传回来的信息
		new Thread(new ServerHandler()).start();
		
		//向服务器发送信息
		PrintWriter pw = null;
		Scanner in = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8")),true);
			
			// 创建扫描器
			in = new Scanner(System.in);
			System.out.println("请输入:");
			while (true) {
				// 发送消息给服务器
				String msg = in.nextLine();
				pw.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			if (pw!=null) {
//				pw.close();
//			}
//			in.close();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
