package org.jgs.javahigh05;

public enum WeekDayEnum {

	
	星期日(0,"找对象玩"),
	星期一(1,"学java"),
	星期二(2,"学js"),
	星期三(3,"学C#"),
	星期四(4,"学设计模式"),
	星期五(5,"学数据结构"),
	星期六(6,"休息");
	
	private int index;
	private String plan;
	private WeekDayEnum() {
	}
	private WeekDayEnum(int index, String plan) {
		this.index = index;
		this.plan = plan;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan; 
	}
	
	public static void printPlan(int day) {
		switch (day) {
		case 1:
			System.out.println(WeekDayEnum.星期一+":"+WeekDayEnum.星期一.getPlan());
			
			break;
		case 2:
			System.out.println(WeekDayEnum.星期二+":"+WeekDayEnum.星期二.getPlan());
			break;
		case 3:
			System.out.println(WeekDayEnum.星期三+":"+WeekDayEnum.星期三.getPlan());
			break;
		case 4:
			System.out.println(WeekDayEnum.星期四+":"+WeekDayEnum.星期四.getPlan());
			break;
		case 5:
			System.out.println(WeekDayEnum.星期五+":"+WeekDayEnum.星期一.getPlan());
			break;
		case 6:
			System.out.println(WeekDayEnum.星期六+":"+WeekDayEnum.星期六.getPlan());
			break;
		case 0:
			System.out.println(WeekDayEnum.星期日+":"+WeekDayEnum.星期日.getPlan());
			break;

		default:
			System.out.println("请输入0-6的数字！！！");
			break;
		}
	}
	
}
