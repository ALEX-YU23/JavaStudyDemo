package org.jgs.day09;

public class MiBracelet extends Bracelet implements ExtraFun,ExtraFun2{

	@Override
	public void showTime() {
		System.out.println("查看时间");

	}

	@Override
	public void showBloodPressure() {
		System.out.println("显示血压");
		
	}

	@Override
	public void showStepNum() {
		System.out.println("显示步数");
		
	}

	@Override
	public void showHeartBeat() {
		System.out.println("显示心率");
		
	}

}
