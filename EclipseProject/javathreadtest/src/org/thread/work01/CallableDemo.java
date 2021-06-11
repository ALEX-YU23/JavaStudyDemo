package org.thread.work01;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
		}
		return "ok";
	}

}
