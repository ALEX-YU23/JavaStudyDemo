package org.jgs.Thread.day01;
/*
 * 演示程序中容易出现的死锁现象
 */
public class ThreadDeadLock {
	
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		
		new Thread(()->{
			Thread t = Thread.currentThread();
			synchronized(a) {
				System.out.println(t.getName()+": i get a");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("i want to get b");
				synchronized (b) {
					System.out.println("i get b");
				}
			}
		}).start();
		
		new Thread(()->{
			Thread t = Thread.currentThread();
			synchronized(b) {
				System.out.println(t.getName()+": i get b");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("i want to get a");
				synchronized (a) {
					System.out.println("i get a");
				}
			}
		}).start();
		
		
		
	}

}
