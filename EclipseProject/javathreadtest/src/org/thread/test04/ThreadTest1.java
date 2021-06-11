package org.thread.test04;
/**
 * 解决线程安全问题的方式三: Lock锁JDK5. e新增
 * 

1.面试题: synchronized 与Lock的异同?
相同:二者都可以解决线程安全问题
不同: synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
Lock需要手动的启动同步(Lock())，同时结束同步也需要手动的实现(unlock())
2.优先使用顺序:
Lock +同步代码块(已经进入了方法体，分配了相应资源)→同步方法(在方法体之外)

 */
import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable{

	private int tickets = 200;
	// 1.实例化ReentrantLock
	private ReentrantLock Lock = new ReentrantLock(true);  // true 公平,不等待
	
	@Override
	public void run() {
		while (true) {
			//2.调用lock方法
			try {
				Lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ":售票,票号为" + tickets);
					tickets--;
				} else {
					break;
				}
			} finally {
				// 3.调用unlock方法解锁
				Lock.unlock();
			}
		}
	}

}

public class ThreadTest1 {

	public static void main(String[] args) {
	
		Window w = new Window();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
