package org.jgs.Thread.day01;
/**
 *  创建线程的步骤：
 	1.定义一个类继承Thread。
    2.重写run方法。
    3.创建子类对象，就是创建线程对象。
    4.调用start方法，开启线程并让线程执行，同时还会告诉jvm去调用run方法
 * @author mosin
 * @DATE 2021年5月27日
 */
public class ThreadDemo {
	
	public static void main(String[] args) {
		//创建线程对象
		Thread myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		
		//自己去调用run方法 线程不具有并发的能力
//		myThread1.run();
//		myThread2.run();
		
		//使用线程中的start方法  将当前的线程纳入 cpu的线程调度
		myThread1.start();
		myThread2.start();
	}

}

/*
 * 使用第一种方式创建线程 
 * 
 * java中继承是单继承   Annimal
 * 
 * 当前线程执行热任务已经固定
 * 
 * */  
class MyThread1 extends Thread{

	//重写run方法  线程真正执行的任务
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("你瞅啥！");
		}
	}

}
class MyThread2 extends Thread{
	
	//重写run方法  线程真正执行的任务
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println("瞅你咋地！");
			}
		}	
		
	
}
