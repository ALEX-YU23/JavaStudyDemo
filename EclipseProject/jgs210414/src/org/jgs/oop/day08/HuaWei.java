package org.jgs.oop.day08;
/**
 * 一个类可以实现多个接口 接口之间采用逗号分割
 * 该类要实现接口中的所有抽象的方法
 * @author mosin
 * @DATE 2021年4月27日
 */
public class HuaWei extends Phone implements PhonePluse,PhonePlus2{

	@Override
	public void photo() {
		
	}

	@Override
	public void music() {
		
	} 

	@Override
	public void call() {
		
	}

	@Override
	public void sendMsg() {
		
	}

	@Override
	public void NFC() {
		System.out.println("可以进行电子消费");
	}


}
