package org.jgs.Thread.day01;
/**
 * 使用匿名内部类创建 线程

 * @author mosin
 * @DATE 2021年5月27日
 */
public class ThreadDemo2 {
	
	public static void main(String[] args) {
	
		
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("瞅你咋地！");
				}
			}
		}).start();
		 
		 new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("你瞅啥！");
				}
				
			}
		}).start();
		
		
		
	}

}

