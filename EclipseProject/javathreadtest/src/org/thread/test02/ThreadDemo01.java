package org.thread.test02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.junit.Test;

public class ThreadDemo01 {

	@Test
	public void test1() {
		String str = "打代码";
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i < 101; i++) {
					if (i%2==0) {
						System.out.println(i);
					}
				}
				
			}
		}).start();
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 101; i++) {
					if (i%2!=0) {
						System.out.println(i);
					}
				}
				
			}
		}.start();
		
		new Thread(()->{
			for (int i = 1; i < 101; i++) {
				if (i%2!=0) {
					System.out.println(str);
				}
			}
		}).start();
	}
	// Callable 和 FutureTask
	@Test
	public void test2() {
//		Callable<Integer> callable = new Callable<Integer>() {
//
//			@Override
//			public Integer call() throws Exception {
//				int sum = 0;
//				for (int i = 1; i < 101; i++) {
//					sum+=i;
//				}
//				return sum;
//			}
//		};
		// lambda表达式写callable接口
		Callable<Integer> callable = ()->{
			int sum = 0;
			for (int i = 1; i < 101; i++) {
				sum+=i;
			}
			return sum;
		};
		
		FutureTask<Integer> futureTask = new FutureTask<>(callable);
		
		Thread thread = new Thread(futureTask);
		
		thread.start();
		
		System.out.println(thread);
		
		try {
			System.out.println(futureTask.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
