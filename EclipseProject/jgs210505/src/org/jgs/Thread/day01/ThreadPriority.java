package org.jgs.Thread.day01;
/**
 * 创建三个线程 演示线程的优先级别
 * 线程的优先级别  1-10
 * 
 * @author mosin
 * @DATE 2021年5月28日
 */
public class ThreadPriority {

	public static void main(String[] args) {
		//最大优先级的线程
		
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println("max");
			}
		});
		
		//默认优先级的线程   5
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println("nor");
			}
		});
		
		//最小优先级的线程
		Thread t3 = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println("min");
			}
		});
		
		//设置线程的优先级别 必须是在线程开启之前
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		//开启线程
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	

}
