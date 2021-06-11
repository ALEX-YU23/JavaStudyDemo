package org.thread.work01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.junit.Test;

public class ThreadTest {

	@Test
	public void test() {
		CopyThread ct = new CopyThread();
		Thread cpth = new Thread(ct,"对拷线程");
		cpth.start();
		System.out.println("你的文件拷贝已经提交，稍后执行完毕会再次提醒你。");
	}

	@Test
	public void test1() {
		CallableDemo cd = new CallableDemo();
		FutureTask<String> futureTask = new FutureTask<>(cd);
		Thread calThread = new Thread(futureTask);
		calThread.start();
		String string = null;
		try {
			string = futureTask.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(string);
	}
	@Test
	public void test2() {
		// 1.创建线程
		Thread thread1 = new Thread(()->{
			for (int i = 1; i <= 100; i++) {
				Thread currentThread = Thread.currentThread();
				System.out.println(currentThread.getName()+":"+currentThread.getPriority()+":"+i);
			}
		});
		thread1.setName("线程一");
		Thread thread2 = new Thread(()->{
			for (int i = 1; i <= 100; i++) {
				Thread currentThread = Thread.currentThread();
				System.out.println(currentThread.getName()+":"+currentThread.getPriority()+":"+i);
			}
		});
		thread2.setName("线程二");
		// 2.就绪状态
		thread1.start();
		thread2.start();
		
		// 3.该线程得到系统资源进入执行状态
		
		// 3.1该线程释放系统资源，进入“就绪状态”
		// 3.2该线程进入了等待或者睡眠，1进入“阻塞状态
		// 3.2.1线程在“阻塞状态”，解除阻塞后，进入“就绪状态”

		// 4. 该线程run方法运行完成后，进入“死亡状态”
 
	}
	@Test
	public void test3() {
		
	}
}
