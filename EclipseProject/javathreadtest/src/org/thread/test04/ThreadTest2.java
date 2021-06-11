package org.thread.test04;

import java.util.concurrent.locks.ReentrantLock;

/***
 *银行有一个账户，
 *有两个储户分别向同一个账户存3000元，每次存1000， 存3次。每次存完打
 *印账户余额。
 * @author AlexYU
 * @date 2021年6月6日下午1:40:13
 */

class Account implements Runnable{
	
	public double money;
	
	private double storeMoney;
	
	private ReentrantLock Lock = new ReentrantLock(true);
	
	public Account() {
	}
	
	public Account(double storeMoney) {
		this.storeMoney = storeMoney;
	}
	
	@Override
	public void run() {
		
		while (true) {
			Lock.lock();
			try {
				if (money<6000) {
					System.out.println(Thread.currentThread().getName() + ":存"+storeMoney+"元钱");
					money+=storeMoney;
					
				} else {
					break;
				}
			} finally {
				Lock.unlock();
			}
			
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {
		Account a = new Account(1000);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		
		t1.setName("储户一");
		t2.setName("储户二");
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
			System.out.println("账户余额为:"+a.money);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
