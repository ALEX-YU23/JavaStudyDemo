package org.jgs.Thread.day01;
/**
 * 演示程序的打断
 * 
 * @author mosin
 * @DATE 2021年5月28日
 */
public class ThreadSleep2 {

	public static void main(String[] args) {
		//创建第一个线程
		
		Thread t1 = new Thread(()->{
			System.out.println("好困呀，睡一会吧，呼呼。。。。。");
			
			try {
				Thread.sleep(1000000L);
			} catch (InterruptedException e) {
				System.out.println("干哈，没看见我在睡觉！");
				e.printStackTrace();
			}
			System.out.println("睡醒了");
			
		});
		
	
		
		Thread t2 = new Thread(()->{
			
			for (int i = 0; i < 5; i++) {
				System.out.println("上课啦，醒一醒！");
			}
			System.out.println("啪。。。。。");
			//打断t1的阻塞状态
			t1.interrupt();
		});
		
		//开启线程
		t1.start();
		t2.start();
		
		
	}
	
	
}


