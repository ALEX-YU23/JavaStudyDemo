package org.jgs.Thread.day01;
/*
 * 静态的同步方法    被static和synchronized所修饰的方法  一定具有同步性
 * synchronized监视是当前类的类对象
 */
public class ThreadDemo06 {

	public static void main(String[] args) {
//		//创建Aoo实例
//		Aoo a1 = new Aoo();
//	    Aoo a2 = new Aoo();
//		
//		new Thread(()->{
//			//a1.dosome();
//			Aoo.dosome();
//		}).start();
//		
//		new Thread(()->{
//			//a2.dosome();
//			Aoo.dosome();
//		}).start();
		
		//创建Boo对象
		Boo boo1 = new Boo();
//		Boo boo2 = new Boo();
		new Thread(()->{
			boo1.do1();
		}).start();
		
		new Thread(()->{
			boo1.do2();
		}).start();
		

	}

}

class Aoo{
	
	public synchronized static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"正在执行dosome()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+"执行dosome()完毕");
	}
	
}

class Boo{
	/**
	 * 互斥锁 在同一个类中有多个被synchronized所修饰的方法
	 * 那么这些同步的方法不能同一个监视对象的线程同时操作
	 */
	public synchronized  void do1() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"正在执行do1()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+"执行do1()完毕");
	}
	
	public synchronized  void do2() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"正在执行do2()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+"执行do2()完毕");
	}
	
}


