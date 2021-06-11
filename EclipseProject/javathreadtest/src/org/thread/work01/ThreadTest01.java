package org.thread.work01;

public class ThreadTest01 {

	public static Runnable runnable = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i <=100; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	};
	
	public static void main(String[] args) {
		test5();

	}

	private static void test5() {

		//线程1实现图片的下载
		Thread downLoad = new Thread(()->{
			System.out.println("开始下载图片");
			for (int i = 0; i <=100; i++) {
				System.out.println("已下载:"+i+"%");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("图片下载完毕！");
		});
		
		
		//线程2 实现图片的显示
		Thread show = new Thread(()->{
			
			System.out.println("开始显示图片");
			//调用join方法 让show进入阻塞状态  变成和downloadt同步 
			try {
				downLoad.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("图片显示完毕！");
		});
		
		//开启线程
		downLoad.start();
		show.start();
		
	}

	// 线程的加入 join()  线程加入后独占资源知道完成
	private static void test4() {
		Thread thread1 = new Thread(runnable);
		
		thread1.setName("线程一");
		
		thread1.start();
		
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if (i==30) {
				// 子线程加入
				try {
					thread1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	// 线程的礼让
	private static void test3() {
		
		Thread thread1 = new Thread(runnable);
		
		thread1.setName("线程一");
		thread1.setPriority(5);
		
		thread1.start();
		
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if (i%6==0) {
				// 主线程礼让
				Thread.yield();
			}
		}
		
	}

	private static void test2() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+":run.....");
				try {
					// 休眠
					Thread.sleep(2000l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":stop.....");
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
	}

	private static void test1() {
		Thread thread1 = new Thread(()->{
			for (int i = 1; i <= 100; i++) {
				Thread currentThread = Thread.currentThread();
				System.out.println(currentThread.getName()+":"+currentThread.getPriority()+":"+i);
			}
		});
		thread1.setName("线程一");
		thread1.setPriority(Thread.MAX_PRIORITY);
		Thread thread2 = new Thread(()->{
			for (int i = 1; i <= 100; i++) {
				Thread currentThread = Thread.currentThread();
				System.out.println(currentThread.getName()+":"+currentThread.getPriority()+":"+i);
			}
		});
		thread2.setName("线程二");
		thread2.setPriority(Thread.MIN_PRIORITY);
		// 2.就绪状态
		thread1.start();
		thread2.start();
		
	}

}
