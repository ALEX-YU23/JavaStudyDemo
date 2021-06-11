package org.thread.test05;
/***
 * 线程通信的应用：经典例题：生产者/消费者问题
 *
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员
 * 会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品
 * 了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 *
 * 分析：
 * 1. 是否是多线程问题？是，生产者线程，消费者线程
 * 2. 是否有共享数据？是，店员（或产品）
 * 3. 如何解决线程的安全问题？同步机制,有三种方法
 * 4. 是否涉及线程的通信？是
 
 * @author AlexYU
 * @date 2021年6月6日下午2:47:23
 */

class Clerk{

	private int product = 0;
	
	// 生产产品
	public synchronized void produceProduct() {
		if (product<20) {
			product++;
			System.out.println(Thread.currentThread().getName()+":开始生产第"+product+"个产品");
			notify(); // 生产了一个产品就可以唤醒消费者
		}else {
			// 等待
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 购买产品
	public synchronized void buyProduct() {
		if (product>0) {
			System.out.println(Thread.currentThread().getName()+":开始购买第"+product+"个产品");
			product--;
			notify();// 购买了一个产品就可以唤醒生产者
		} else {
			// 等待
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Customer extends Thread{
	
private Clerk clerk;
	
	public Customer(Clerk clerk) {
		this.clerk = clerk;
	}
	@Override
	public void run() {
		System.out.println(getName()+"开始购买产品.......");
		
		while (true) {
			
			try {
				sleep(550);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			clerk.buyProduct();
		}
	}
}

class Productor extends Thread{
	
	private Clerk clerk;
	
	public Productor(Clerk clerk) {
		this.clerk = clerk;
	}
	
	@Override
	public void run() {
		System.out.println(getName()+"开始生产产品.......");
		
		while (true) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			clerk.produceProduct();
		}
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		
		Productor p1 = new Productor(clerk);
		p1.setName("生产者");
		
		Customer c1 = new Customer(clerk);
		c1.setName("消费者c1");
		Customer c2 = new Customer(clerk);
		c2.setName("消费者c2");
		Customer c3 = new Customer(clerk);
		c3.setName("消费者c3");
		
		p1.start();
		c1.start();
		c2.start();
		c3.start();
		
	}
}
