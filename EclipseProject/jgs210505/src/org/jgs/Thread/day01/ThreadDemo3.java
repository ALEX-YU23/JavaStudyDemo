package org.jgs.Thread.day01;
/**
 * 创建线程的步骤  创建线程的第二种方式
- 定义类实现 Runnable 接口
- 覆盖接口中的run方法
- 创建Thread类的对象  Thread(Runnable r)
- 将Runnable接口的子类对象作为参数传递给Thread类的构造函数
- 调用Thread类的start方法开启线程
 * @author mosin
 * @DATE 2021年5月27日
 */
public class ThreadDemo3 {
	
	public static void main(String[] args) {
		//创建任务对象  初始状态
		Runnable myThread1 = new MyThread3();
		Runnable myThread2 = new MyThread4();
		
		//创建两个Thread类的对象   Thread(Runnable target)
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		
		
		//使用线程中的start方法  将当前的线程纳入 cpu的线程调度   可运行状态
		thread1.start();
		thread2.start();
	}

}

/*
 * 使用第二种方式创建线程  实现Runnable接口
 * 
 * 定义了两个任务
 * 
 * */  
class MyThread3 implements Runnable{


	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("瞅你咋地！");
		}
	}

	

}
class MyThread4 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("你瞅啥！");
		}
	}

}
