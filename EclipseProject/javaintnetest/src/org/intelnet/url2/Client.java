package org.intelnet.url2;
/**
 * 
 * @author AlexYU
 * @date 2021年6月1日下午1:39:11
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	private Socket socket;
	
	public Client() {
		try {
			System.out.println("正在启动服务端.....");
			socket = new Socket("localhost",8887);
			System.out.println("服务端启动成功.....");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 客户端需要做的任务 
	//1.读入服务器的消息并显示
	//2.发送消息给服务器
	// 使用多线程实现读写分离
	public void start() {

		//  创建一个线程:1.读入服务器的消息并显示
		new Thread(new serverHandler()).start();
		
		//2.发送消息给服务器
		PrintWriter pw= null;
		try {
			// 创建服务器输出流
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			// 创建扫描器 实现输入
			Scanner in = new Scanner(System.in);
			while (true) {
				String next = in.nextLine();
				pw.println(next);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	//创建一个类 实现客户端的读写分离
	//1.读入服务器的消息并显示
	private class serverHandler implements Runnable{

		@Override
		public void run() {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
				
				String msg = null;
				while ((msg = br.readLine())!=null) {
					System.out.println( msg);
				}
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br!=null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
}
