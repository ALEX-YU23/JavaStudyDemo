package org.thread.test03;

import java.util.concurrent.Callable;

/**
 * 
 * 多线程模拟黄牛抢票
 *1.共用100张票
 *2.三个抢票线程表示三个黄牛
 *3.每个黄牛抢了多少张票
 * @author AlexYU
 * @date 2021年5月31日下午8:55:37
 */
public class Scalpers implements Callable<Integer>{

	// 总票数
	public static int tickets = 200;
	// 个人票数
	public int ts = 0;
	@Override
	public Integer call() throws Exception {
		while (true) {
			if(tickets>0) {
				this.ts++;
				System.out.println(Thread.currentThread().getName()+"抢到第"+tickets+"张票");
				tickets--;
			} else {
				break;
			}
		}
		return this.ts;
	}
	

	
	
	
	
}
