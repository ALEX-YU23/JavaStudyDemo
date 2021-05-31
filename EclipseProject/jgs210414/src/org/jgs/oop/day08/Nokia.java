package org.jgs.oop.day08;

public class Nokia extends Phone{

	@Override
	public void call() {
		System.out.println("使用2G信号打电话");
		
	}

	@Override
	public void sendMsg() {
		System.out.println("发送文本信息");
	}
	
	

}
