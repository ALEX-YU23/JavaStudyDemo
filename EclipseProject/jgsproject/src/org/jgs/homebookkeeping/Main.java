package org.jgs.homebookkeeping;
import org.jgs.homebookkeeping.Utility;
/**
 * @Description 家庭收支记账软件主界面
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日上午9:54:24
 */
public class Main {

	public static void main(String[] args) {
		int balence = 10000;
		String detailTilte = "收支\t账户金额\t   收支金额\t说     明\n";
		String rAndeString = "原有";
		double account = balence;
		double raeMoney = 0;
		String explain = "无";
		String detailString = rAndeString + "\t" + account + "\t    " + raeMoney + "\t" +explain + "\n" ;
		lop:while (true) {
			System.out.println("--------------家庭收支记账软件--------------");
			System.out.println();
			System.out.println("\t\t1收支明细");
			System.out.println("\t\t2登记收入");
			System.out.println("\t\t3登记支出");
			System.out.println("\t\t4退出");
			System.out.println();
			System.out.print("\t\t请选择（1-4）：");
			
			
			
			Utility utility= new Utility();
			char readMenuSelection = utility.readMenuSelection();
//			System.out.println(readMenuSelection);
			switch (readMenuSelection) {
			case '1':
				System.out.println("--------------当前收支明细记录--------------");
				System.out.println(detailTilte);
				
				System.out.println(detailString);
//				System.out.println(readMenuSelection);
				
				break;
			case '2':
				System.out.println(readMenuSelection);
				
				break;
			case '3':
				rAndeString = "支出";
				System.out.println("本次支出金额：");
				raeMoney = utility.readNumber();
				account -= raeMoney;
				System.out.println("本次支出说明：");
				explain = utility.readString();
				detailString = rAndeString + "\t" + account + "\t    " + raeMoney + "\t" +explain + "\n" ;
//				System.out.println(detailString);
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
