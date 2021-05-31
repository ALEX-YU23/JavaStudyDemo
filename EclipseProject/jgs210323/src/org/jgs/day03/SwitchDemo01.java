package org.jgs.day03;

/**
 * switch结构
 * 语法：
 * 变量 类型  byte  short  int  char  String Enum
 * switch(变量){
 * 
 * 		case  value1:
 * 				语句;
 * 				break;
 * 		case  value2:
 * 				语句
 * 				break;
 * 		......
 * 		default:
 * 			语句;
 * 	
 * }
 * 
 * 
 * @author mosin
 * @DATE 2021年3月30日
 */
public class SwitchDemo01 {
	/**
	 * 制定学习计划
	 * @param args
	 */
	public static void main(String[] args) {

		int day = 7; 
		switch (day) {
		case 1:
			System.out.println("学习java");
			break;
		case 2:
			System.out.println("学习javascript");
			break;
		case 3:
			System.out.println("学习html");
			break;
		case 4:
			System.out.println("学习css");
			break;
		case 5:
			System.out.println("学习mysql");
			break;
		case 6:
			System.out.println("休息");
			break;
		case 7:
			System.out.println("休息");
			break;
		default:
			System.out.println("请输入正确的日期");
			break;
		}

	}

}
