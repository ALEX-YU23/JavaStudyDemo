package org.thread.test03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.junit.Test;

public class ScalpersTest {

	@Test
	public void test() {
		Scalpers s = new Scalpers();
		
		FutureTask<Integer> cow1 = new FutureTask<>(s);
		FutureTask<Integer> cow2 = new FutureTask<>(s);
		FutureTask<Integer> cow3 = new FutureTask<>(s);
		
		Thread scalper1 = new Thread(cow1);
		scalper1.setName("黄牛1");
		Thread scalper2 = new Thread(cow1);
		scalper2.setName("黄牛2");
		Thread scalper3 = new Thread(cow1);
		scalper3.setName("黄牛3");
		
		scalper1.start();
		scalper2.start();
		scalper3.start();
		
		try {
			System.out.println("黄牛1:"+cow1.get());
			System.out.println("黄牛2:"+cow2.get());
			System.out.println("黄牛3:"+cow3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
