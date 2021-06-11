package org.thread.test03;

public class ScalpersRTest {

	public static void main(String[] args) {
		
		ScalpersRa scalpersR1 = new ScalpersRa();
		ScalpersRa scalpersR2 = new ScalpersRa();
		ScalpersRa scalpersR3 = new ScalpersRa();
		
//		Thread scalpersR1 = new Thread(scalpers1);
//		Thread scalpersR2 = new Thread(scalpers1);
//		Thread scalpersR3 = new Thread(scalpers1);
		
		scalpersR1.setName("黄牛一");
		scalpersR2.setName("黄牛二");
		scalpersR3.setName("黄牛三");
		
		scalpersR1.start();
		scalpersR2.start();
		scalpersR3.start();
		
		try {
			Thread.sleep(1899);
			System.out.println();
			System.out.println("黄牛:"+ScalpersRa.ts);
			System.out.println(ScalpersRa.tickets);
//			System.out.println("黄牛2:"+ScalpersR.ts);
//			System.out.println("黄牛3:"+ScalpersR.ts);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
