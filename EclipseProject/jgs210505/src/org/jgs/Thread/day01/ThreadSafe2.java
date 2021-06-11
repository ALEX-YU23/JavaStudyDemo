package org.jgs.Thread.day01;
/**
 * 创建多个线程 模拟抢票操作
 * 
 * @author mosin
 * @DATE 2021年5月31日
 */
public class ThreadSafe2 {

	public static void main(String[] args) {
		int i = 6;
		while (i>0) {
			
			Station station = new Station();
			
			new Thread(()->{
				station.getTicket2();
			}).start();
			
			
			i--;
		}
		try {
			Thread.sleep(7700l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Station.tickets);
		

	}

}
