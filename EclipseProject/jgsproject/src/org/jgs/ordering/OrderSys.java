package org.jgs.ordering;
import java.util.Scanner;


public class OrderSys {

	public static void main(String[] args) {
		
		
		// 实例化扫描类
		Scanner scan = new Scanner(System.in);
		
		// 定义跳出循环条件
		boolean isQuitSystem = true;
		
		// 定义菜单
		String [][] menu = new String [3][];
		menu[0] = new String[] {"1","红烧带鱼","38.0"};
		menu[1] = new String[] {"2","鱼香肉丝","20.8"};
		menu[2] = new String[] {"3","时令鲜蔬","10.8"};
		
		// 定义订单order
		String [][] order = new String [4][7];
		order[0] = new String[] {"张祥","时令鲜蔬","2","12","合肥一元啦","78.1","已完成"};
		order[1] = new String[] {"李辉","鱼香肉丝","2","12","合肥一元啦","48.1","已完成"};
		order[2] = new String[] {"刘浩","红烧带鱼","2","12","合肥一元啦","38.1","已预定"};
		// 订单下标从3开始
		int orderCount = 3;
		
		// 送餐费
		double mealDeliveryFee = 6.0;
		
		
		while (isQuitSystem) {
			
			System.out.println("\t欢迎使用“吃货联盟v2”订餐系统");
			System.out.println("\t****************************");
			System.out.println("\t\t1、我要订餐");
			System.out.println("\t\t2、查看餐袋");
			System.out.println("\t\t3、签收订单");
			System.out.println("\t\t4、删除订单");
			System.out.println("\t\t5、我要点赞");
			System.out.println("\t\t6、退出系统");
			System.out.println("\t****************************");
			System.out.print("\t请选择：");
			
			int choice = scan.nextInt();
			
			
			switch (choice) {
			case 1:
				//  订餐
				//  判断餐袋是否未满
				if (orderCount>=order.length) {
					System.out.println("\t餐袋已满！！请删除已签收订单");
					break;
				} 
				scan.nextLine();  // 接收nextInt之后的换行符 
				
				System.out.println("\t***我要订餐***");
				// 输入订餐人姓名并保存在order数组[0]中
				System.out.print("\t请输入订餐人姓名：");
				order[orderCount][0] = scan.nextLine();
				System.out.println("\t序号\t\t菜名\t\t单价");
				// 遍历菜单数组并格式化输出
				for (int i = 0; i < menu.length; i++) {
					for (int j = 0; j < menu[i].length; j++) {
						System.out.print("\t"+menu[i][j]+"\t");
					}
					System.out.println();
				}
				
				// 输入菜品编号得到菜品名称并保存在order数组[1]中
				int dishName =0;
				do {
					System.out.print("\t请选择您要点的菜品编号：");
					// 编号减一是菜单数组下标
					dishName = scan.nextInt() ;
				// 当输入的菜品编号大于菜单数组长度或者小于0时再次输入
				} while (dishName>menu.length||dishName<0);
				
				dishName -= 1;
				order[orderCount][1] = menu[dishName][1];
				
				// 输入份数并保存在order数组[2]中
				System.out.print("\t请选择您需要的份数：");
				order[orderCount][2] = scan.next();
				
				int sendTime;
				do {
					System.out.print("\t请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
					sendTime = scan.nextInt();
				} while (sendTime<10||sendTime>20);
				// 输入送餐时间并保存在order数组[3]中
				order[orderCount][3] = sendTime + "";
				
				// 输入送餐地址并保存在order数组[4]中
				System.out.print("\t请输入送餐地址：");
				order[orderCount][4] = scan.next();
				
				System.out.println("\t订餐成功！");
				System.out.println("\t您订的是：" + order[orderCount][1] + order[orderCount][2] + "份");
				System.out.println("\t送餐时间：" + order[orderCount][3] + "点");
				
				// 将菜品价格转为double型
				double price = Double.parseDouble(menu[dishName][2]);
				// 将份数转为double型
				double copies = Double.parseDouble(order[orderCount][2]);
				// 计算餐费
				double mealFee = price * copies;
				
				// 计算总价     超过50元免配送费
				double sumPrice = (mealFee > 50) ? mealFee : (mealFee + mealDeliveryFee);
				mealDeliveryFee = (mealFee > 50) ? 0 : mealDeliveryFee;
				// 将总价保存在order数组[5]中
				order[orderCount][5] = String.format("%.2f", sumPrice);
				System.out.println("\t餐费：" + String.format("%.2f", mealFee) + "元，送餐费" + mealDeliveryFee +"元，总计：" + order[orderCount][5] + "元。");
				// 将订单状态保存在order数组[5]中
				order[orderCount][6] = "已预订";
				
				// 订单数加一
				orderCount ++ ;
				
				break;
			case 2:
				
				System.out.println("\t***查看餐袋***");
				System.out.println("\t序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i < orderCount; i++) {
					System.out.printf("\t" + (i+1));
					System.out.print("\t" + order[i][0]);
					System.out.print("\t" + order[i][1] +order[i][2]+"份" );
					System.out.print("\t" + order[i][3] + "点");
					System.out.print("\t" + order[i][4]);
					System.out.print("\t" + order[i][5]);
					System.out.print("\t" + order[i][6]);
					System.out.println();
				}
				System.out.println();
				break;
			case 3:
				System.out.println("\t***签收订单***");
				System.out.print("\t请选择要签收的订单序号：");
				int signOrderNum= scan.nextInt()-1;
				while (signOrderNum<=0||signOrderNum>=orderCount){
					System.out.print("\t您输入的订单序号不存在，请重新选择要签收的订单序号：");
					signOrderNum = scan.nextInt()-1;
				} 
				if ("已完成".equals(order[signOrderNum][6])) {
					System.out.println("\t订单已经签收过了,请不要重复签收！");
				}else {
					order[signOrderNum][6] = "已完成";
					System.out.println("\t订单已签收");
				}
				
				break;
			case 4:
				System.out.println("\t***删除订单***");
				System.out.println("\t有"+orderCount+"个订单");
				// 判断还有多少订单
				if (orderCount==0) {
					System.out.println("订单已经全部删除！！");
					break;
				}
				System.out.print("\t请选择要删除的订单序号：");
				int delOrderNum = scan.nextInt();
				while ((delOrderNum<0||delOrderNum>orderCount)||"已预定".equals(order[delOrderNum-1][6])) {
					System.out.println("\t订单号不在范围内或者订单未签收");
					System.out.print("\t请重新选择要删除的订单序号：");
					// 订单号不在范围内并且未签收订单不能删除
					delOrderNum = scan.nextInt();
				} 
				delOrderNum -= 1;
				for (int i = delOrderNum; i < orderCount; i++) {
					if (i == order.length - 1 ) {
						order[i] = null;
					} else {
						order[i] = order[i+1];
					}
				}
				orderCount--;
				System.out.println("\t删除订单成功！");
				break;
			case 5:
				System.out.println("\t***我要点赞***");
				
				System.out.println("\t序号\t\t菜名\t\t单价");
				// 遍历菜单数组并格式化输入
				for (int i = 0; i < menu.length; i++) {
					for (int j = 0; j < menu[i].length; j++) {
						System.out.print("\t"+menu[i][j]+"\t");
					}
					System.out.println();
				}
				int likeNum ;
				// 判断菜品是否有点赞
				do {
					System.out.print("\t请选择您要点赞的菜品序号：");
					likeNum = scan.nextInt() - 1;
					
				} while (likeNum<0||likeNum>=menu.length);
				
				if (menu[likeNum].length==3) {
					// 无点赞
					String [] menuPice = new String [4];
					for (int i = 0; i < menuPice.length; i++) {
						if (i < menu[likeNum].length) {
							menuPice[i] = menu[likeNum][i];
						}else {
							menuPice[i] = "1赞";
						}
						
					}
					menu[likeNum] = menuPice;
				} else {
					// 有点赞
					// 从已有点赞中取出赞数
					String strZan = menu[likeNum][menu[likeNum].length-1].charAt(0) + "";
					int intZanNum = Integer.parseInt(strZan) + 1;
					menu[likeNum][menu[likeNum].length-1] = intZanNum + "赞";
				}
				System.out.println("\t点赞成功！");
				
				break;
			// 菜单六退出系统
			case 6:
				System.out.println("\t谢谢使用，欢迎下次光临！");
				isQuitSystem = false;
				break;

			default:
				break;
			}
			
			// 输入0返回主菜单
			int isQuit = 1;
			while (isQuit!=0&&choice!=6) {
				
				System.out.print("\t输入0返回：");
				isQuit = scan.nextInt();
				
			}
		}
		scan.close();
	}

}