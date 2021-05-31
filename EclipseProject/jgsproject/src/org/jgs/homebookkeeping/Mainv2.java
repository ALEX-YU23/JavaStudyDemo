package org.jgs.homebookkeeping;
import org.jgs.homebookkeeping.Utility;
/**
 * @Description 家庭收支记账软件主界面
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日上午9:54:24
 */
public class Mainv2 {

	public static void main(String[] args) {
		int balence = 10000;
		// 收支明细title
		String detailTilte = "收支\t账户金额\t   收支金额\t说     明\n";
		// 收支类型
		String rAndeString = "原有";
		// 账户金额
		double account = balence;
		// 收支金额
		double raeMoney = 0;
		// 收支说明
		String explain = "\t无";
		// 初始化收支明细
		String detailInitial = rAndeString + "\t" + account + "\t   " + raeMoney + "\t" +explain + "\n" ;
		// 拼接收支明细
		String detailString = "";
		lop:while (true) {
			// 菜单内容
			System.out.println("--------------家庭收支记账软件--------------");
			System.out.println();
			System.out.println("\t\t1收支明细");
			System.out.println("\t\t2登记收入");
			System.out.println("\t\t3登记支出");
			System.out.println("\t\t4退出");
			System.out.println();
			System.out.print("\t\t请选择（1-4）：");
			// 新建一个工具类
			Utility utility= new Utility();
			// 读取用户输入
			char readMenuSelection = utility.readMenuSelection();
			// 根据输入做出判断
			switch (readMenuSelection) {
			case '1':
				System.out.println("--------------当前收支明细记录--------------");
				System.out.println(detailTilte);
				detailInitial += detailString;
				System.out.println(detailInitial);
				break;
			case '2':
				rAndeString = "收入";
				System.out.println("本次收入金额：");
				raeMoney = utility.readNumber();
				account += raeMoney;
				System.out.println("本次收入说明：");
				explain = utility.readString();
				detailString = rAndeString + "\t" + account + "\t    " + raeMoney + "\t" +explain + "\n" ;
				System.out.println("登记成功!!!");
				break;
				
			case '3':
				rAndeString = "支出";
				System.out.println("本次支出金额：");
				raeMoney = utility.readNumber();
				account -= raeMoney;
				System.out.println("本次支出说明：");
				explain = utility.readString();
				detailString = rAndeString + "\t" + account + "\t    " + raeMoney + "\t" +explain + "\n" ;
				System.out.println("登记成功!!!");
				break;
			case '4':
				System.out.println("确认退出么?(Y/N)");
				char readConfirmSelection = utility.readConfirmSelection();
				if (readConfirmSelection == 'Y') {
					break lop;
				}
				break;
			default:
				break;
			}
		}
		
	}

	

}
