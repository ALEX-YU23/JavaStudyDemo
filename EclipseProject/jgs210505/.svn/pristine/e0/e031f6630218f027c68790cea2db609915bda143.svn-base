package org.jgs.net.day01;
/**
 * Socket 套接字  基于TCP协议的数据传输  
 * 类中封装了一些关于tcp数据传输的细节
 * 
 * 基于字节流进行数据传输的
 * 
 * @author mosin
 * @DATE 2021年6月1日
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private  Socket  socket;
	
	/*初始化客户端
	 * Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号			
	 * host：发送数据的目标地址 也就是IP
	 * port：目标地址的端口号 用于找到对应的应用程序
	 * */ 
	public Client() {
		try {
			System.out.println("正在启动客户端....");
			socket = new Socket("localhost",8888);
			System.out.println("客户端启动成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//客户端需要做的任务
	public void start() {
		PrintWriter pw = null;
		try {
			//获取字节输出流 向服务器发送数据
			OutputStream os = socket.getOutputStream();
			//转换成字符输出端流  方便发送中文
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			//字符缓冲流 提高字符输出的效率
			BufferedWriter bw = new BufferedWriter(osw);
			//使用具有行刷新功能的流 写出字符 将第二个参数设置为true 开启流的行刷新功能
			pw = new PrintWriter(bw,true);
			
			//创建扫描器  实现用户的输入
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String  msg = scanner.nextLine();
				pw.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭流释放资源
			if(pw!=null) {
				pw.close();
			}
		}
		
		
		
	}
	
	
	//启动客户端
	public static void main(String[] args) {
		Client client = new  Client();
		client.start();
	}
	
	

}
