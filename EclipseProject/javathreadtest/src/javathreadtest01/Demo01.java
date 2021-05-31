package javathreadtest01;

public class Demo01 {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
	
		TicketThread ticketThread1 = new TicketThread();
		TicketThread ticketThread2 = new TicketThread();
		TicketThread ticketThread3 = new TicketThread();
		
		ticketThread1.setName("黄牛一");
		ticketThread2.setName("黄牛二");
		ticketThread3.setName("黄牛三");
		
		ticketThread1.start();
		ticketThread2.start();
		ticketThread3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(TicketThread.ticketCount);
		System.out.println(TicketThread.count);
		
	}
}
