package org.thread.test04;
/**
 *使用两个线程打印1-100。线程1,线程2交替打印 
 *
 *涉及到的三个方法:
wait():-旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
notify(): -且执行此方法，就会唤醒被wait的一个线程。 如果有多个线程被wait,就唤醒优先级高的
notifyAll():-旦执行此方法，就会唤醒所有被wait的线程。
说明:
1. wait(), notify(), notifyAll()三个方法必须使用在同步代码块或同步方法中。
2. wait(), notify(), notifyALL()三个方法的调用者必须是同步代码块或同步方法中的同步监视器
	否则，会出现ILLegalMonitorStateException异 常
3.wait()，notify()， notifyALl()三个方法是定义在java. Lang. object类中。
 * 面试题：sleep() 和 wait()的异同？
 * 1.相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态。
 * 2.不同点：1）两个方法声明的位置不同：Thread类中声明sleep() , Object类中声明wait()
 *          2）调用的要求不同：sleep()可以在任何需要的场景下调用。 wait()必须使用在同步代码块或同步方法中
 *          3）关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁。
 *
 * @author AlexYU
 * @date 2021年6月6日下午2:09:05
 */

class Number implements Runnable{
	private int number;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				// 唤醒一个线程
				notifyAll();
				if (number<100) {
					System.out.println(Thread.currentThread().getName()+":"+number);
					number++;
					try {
						// 等下一个线程
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
		}
		
	}
}


public class ThreadTest3 {

	public static void main(String[] args) {
		Number number = new Number();
		
		Thread t1 = new Thread(number);
		Thread t2 = new Thread(number);
		Thread t3 = new Thread(number);
		Thread t4 = new Thread(number);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
