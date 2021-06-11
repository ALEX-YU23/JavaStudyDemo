package org.thread.test03;

public class StationTest {

	public static void main(String[] args) {
		
		Station s = new Station();
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		
		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
