package org.jgs.Thread.day01;
/**
 * 获取线程的相关信息
 * @author mosin
 * @DATE 2021年5月28日
 */
public class ThreadStatus {

	public static void main(String[] args) {
		//获取去main方法中的线程
		Thread t1 = Thread.currentThread();
		System.out.println(t1); //Thread[main,5,main]
		//获取当前线程的优先级  1-10
		int priority = t1.getPriority();
		System.out.println("线程的优先级:"+priority);
		//获取线程的最大优先级
		System.out.println("最大优先级:"+Thread.MAX_PRIORITY);
		//获取线程的最小优先级
		System.out.println("最小优先级:"+Thread.MIN_PRIORITY);
		//获取当前线程的名字
		System.out.println("name:"+t1.getName());
		//设置线程的名字  thread0  thread1
		t1.setName("主线程");
		System.out.println("name:"+t1.getName());
		//获取线程的id
		long id = t1.getId();
		System.out.println("id:"+id);
		
		//查看线程是否还存活
		boolean alive = t1.isAlive();
		System.out.println("线程是否存活:"+alive);
	
		//当前线程是不是被打断
		boolean interrupted = t1.isInterrupted();
		System.out.println(interrupted);
		
		//获取当前线程是不是守护线程
		boolean daemon = t1.isDaemon();
		System.out.println(daemon);
	}

}
