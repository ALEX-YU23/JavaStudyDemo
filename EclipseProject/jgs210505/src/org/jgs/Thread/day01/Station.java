package org.jgs.Thread.day01;
/*
 * 抽取火车站类  
 */
public class Station {
	
	public  static int tickets = 200;
	/**
	 * 方法的同步 不允许多个线程同时操作一个同步的方法
	 * 被synchronized修饰的方法就是一个同步的方法
	 * 同步的方法 保证了数据的安全 但是同时降低了程序执行的效率
	 * @return
	 */
	public synchronized int getTicket() {
		//获取运行当前方法的线程
		Thread t = Thread.currentThread();
		if(tickets==0) {
			System.out.println("已经没票了");
			throw new RuntimeException("票已经售罄");
		}
		//主动让出cpu的运行时间  实际开发时 不要这么操作
		t.yield();
		return tickets--;
	}
	
	
	
	public  void getTicket2() {
		//获取运行当前方法的线程
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":"+"正在选票");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/**
		 * 同步代码块    该代码块具有同步效果的前提是 监视的是同一个对象
		 * 语法：
		 * synchronized(监视的对象){
		 * 		需要同步的代码
		 * }
		 * 可以一定程度上解决同步方法效率低的问题
		 */
		
		synchronized(this){
			System.out.println(t.getName()+":"+"正在出票");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println(t.getName()+":"+"结账离开");
	}

}
