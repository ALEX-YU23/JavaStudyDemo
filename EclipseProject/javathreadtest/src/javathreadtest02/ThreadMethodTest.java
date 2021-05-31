package javathreadtest02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadMethodTest {

	public static void main(String[] args) {
		int a = 100;
		int b = 12;
//		Integer b = 150;
		// 创建一个Callable的线程
		FutureTask<Integer> ft_1 = new FutureTask<>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= a; i++) {
					sum+=i;
				}
				return sum;
			}
		});
		
		FutureTask<Integer> ft_2 = new FutureTask<>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= b; i++) {
					sum+=i;
				}
				
				return sum;
			}
		});
		
		Thread thread_ft1 = new Thread(ft_1);
		Thread thread_ft2 = new Thread(ft_2);
		
		// 设置线程名字
		thread_ft1.setName("一号");
		thread_ft2.setName("二号");
		
		// 读取线程名字
		System.out.println(thread_ft1.getName()+":"+thread_ft1.getId());
		System.out.println(thread_ft2.getName()+":"+thread_ft2.getId());
		
		thread_ft1.start();
		thread_ft2.start();
		
		try {
			System.out.println(ft_1 .get());
			System.out.println(ft_2 .get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
