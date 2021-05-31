package org.jgs.Thread.day01;
/**
 * 线程的阻塞状态
 * 
 * @author mosin
 * @DATE 2021年5月28日
 */
public class ThreadSleep {

	
	public static void main(String[] args) {
		
		System.out.println("程序开始执行");
		for (int i = 10; i >0; i--) {
			System.out.println(i);
			//让当前的线程阻塞 1s  阻塞状态的线程 可能被中断
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("程序执行结束");
	}
	
	
	
}
