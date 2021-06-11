package org.jgs.Thread.day01;
/**
 * 创建多个线程 模拟抢票操作
 * 
 * @author mosin
 * @DATE 2021年5月31日
 */
public class ThreadSafe {

	public static void main(String[] args) {
		Station station1 = new Station();
		Station station2 = new Station();
//		new Thread(()->{
//			//获取当前的线程
//			Thread t = Thread.currentThread();
//			while(true) {
//				int ticket = station.getTicket();
//				System.out.println(t.getName()+":"+ticket);
//			}
//		}).start();
//		
//		new Thread(()->{
//			//获取当前的线程
//			Thread t = Thread.currentThread();
//			while(true) {
//				int ticket = station.getTicket();
//				System.out.println(t.getName()+":"+ticket);
//			}
//		}).start();
		
		new Thread(()->{
			station1.getTicket2();
		}).start();
		new Thread(()->{
			station2.getTicket2();
		}).start();
		
		

	}

}
