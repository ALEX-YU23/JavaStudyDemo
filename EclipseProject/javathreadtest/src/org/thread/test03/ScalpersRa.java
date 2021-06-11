package org.thread.test03;

/**
 * 
 * 多线程模拟黄牛抢票
 *1.共用100张票
 *2.三个抢票线程表示三个黄牛
 *3.每个黄牛抢了多少张票
 * @author AlexYU
 * @date 2021年5月31日下午8:55:37
 */
public class ScalpersRa extends Thread{

	// 总票数
	public static int tickets = 200;
	// 个人票数
	public static int ts = 0;

	public final static Object lock = new Object();
	
	
	@Override
	public void run() {
		while (true) {
			// 同步代码块
			synchronized (lock) {

				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "抢到第" + tickets + "张票");
					tickets--;
					System.out.println("还剩" + tickets + "张票");
					ts++;
				} else {
					System.out.println(Thread.currentThread().getName() + ": 票没了");

					break;
				}
			}
		}
	}

}
