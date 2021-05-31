package org.jgs.Thread.day01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的第三种方式  Callable接口  有返回值  可抛出异常
 * 创建线程的步骤
- 实现Callable接口
- 重写call方法
- 创建自定义线程类对象   MyCallThread
- 创建 FutureTask 类的实例对象，把自定义线程类对象作为构造方法的参数
- 创建线程类Thread对象，把FutureTask 类的对象作为构造方法的参数
- 调用Thread的start方法
 * @author mosin
 * @DATE 2021年5月28日
 */
public class ThreadDemo05 {
	
	public static void main(String[] args) {
		
		//自定义线程类对象   MyCallThread
		MyCallThread myCallThread = new MyCallThread();
		//创建 FutureTask 类的实例对象   间接实现Runnable
		FutureTask<Long> futureTask = new FutureTask<Long>(myCallThread);
		//创建Thread对象
		Thread thread = new Thread(futureTask);
		//开启线程   start()
		thread.start();
		//获取返回值
		try {
			Long num = futureTask.get();
			System.out.println(num);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}

class MyCallThread implements Callable<Long>{

	//重写call方法
	@Override
	public Long call() throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
		}
		return 20L;
	}

}


