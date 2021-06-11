package org.jgs.Thread.day01;
/**
 * join方法的使用  线程进入阻塞状态  
 * 也可以理解为让两个线程从异步变为同步
 * @author mosin
 * @DATE 2021年5月31日
 */
public class ThreadJoinDemo01 {

	public static void main(String[] args) {
		
		//线程1实现图片的下载
		Thread downLoad = new Thread(()->{
			System.out.println("开始下载图片");
			for (int i = 0; i <=100; i++) {
				System.out.println("已下载:"+i+"%");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("图片下载完毕！");
		});
		
		
		//线程2 实现图片的显示
		Thread show = new Thread(()->{
			
			System.out.println("开始显示图片");
			//调用join方法 让show进入阻塞状态  变成和downloadt同步 
			try {
				downLoad.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("图片显示完毕！");
		});
		
		//开启线程
		downLoad.start();
		show.start();
	}

}
