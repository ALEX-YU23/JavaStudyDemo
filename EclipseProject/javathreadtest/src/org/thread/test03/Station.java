package org.thread.test03;
/**
 * 
 * @author AlexYU
 * @date 2021年5月31日下午8:55:37
 */
public class Station implements Runnable{

	public static int tickets = 200;
	

	@Override
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName() + "售票第" + (tickets--) +"张");
			} else {
				break;
			}
		}
	}
	
	
	
}
