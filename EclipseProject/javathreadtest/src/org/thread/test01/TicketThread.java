package org.thread.test01;

public class TicketThread extends Thread{

	//总票数
	public static int ticketCount = 100;
	
	//个人抢票数
	public static int count = 0; 
	
	public static synchronized void getTicket() {
		if (ticketCount>0) {
			count++;
			System.out.println(Thread.currentThread().getName()+"抢到第"+count+"张票");
			ticketCount--;
			System.out.println("还剩"+ticketCount+"张票");
		} 
	}
	
	@Override
	public void run() {
		
		while (true) {
			getTicket();
			
		}
	}
	
}
