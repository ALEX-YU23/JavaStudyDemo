package org.jgs.Thread.day01;
/**
 * 守护线程的使用  守护线程也是后台线程
 * 当所有的前台线程执行结束后，守护线程不论是否执行完毕 都会被强制终止
 * @author mosin
 * @DATE 2021年5月31日
 */
public class ThreadDeamoDemo01 {

	public static void main(String[] args) {
		
		Thread girl = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("你别过来,过来我就跳下去！");	
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("啊。。。。。。。。。。");
		});
		
		
		Thread boy = new Thread(()->{
			while(true) {
				System.out.println("你别跳,你跳我也跳！");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//设置boy为守护线程  要在启动之前设置
		boy.setDaemon(true);
//		启动线程 
		boy.start();
		girl.start();

	}

}
