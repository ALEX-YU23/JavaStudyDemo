package org.jgs.day08;

import java.util.Scanner;

/**
 * 吃货联盟订餐系统
 * @author mosin
 * @DATE 2021年4月13日
 */
public class OrderSystem {

	public static void main(String[] args) {
		
		/*
		 * 定义数据
		 * 1.菜单  序号  菜名  价格
		 * 2.订单  序号  订餐人 菜品信息 时间   地址  总价  状态
		 * 
		 * */
		//菜单
		String[] dishName = {"红烧带鱼","鱼香肉丝","红烧猪蹄"};
		double[] prices = {18,10,30};
		int[] praise= new int[3];
		
		//订单信息
		String[] names = new String[3];
		String[]  dishMsg = new String[3];
		int[] times = new int[3];
		String[] address = new String[3];
		double[]  sumPrices = new double[3];
		int[] states = new int[3]; //订单状态 0 表示已预订 1 表示已完成
		
		//初始化订单
		 names[0] = "张三";
		 dishMsg[0] = "红烧带鱼 2份";
		 times[0] = 12;
		 address[0] = "北城大道A02";
		 sumPrices[0] = 36;
		 states[0] = 0;  
		
		
		
		
		//创建扫描器  接收用户的输入
		Scanner scanner = new Scanner(System.in);
		//定义一个变量 存储数据 判定是否继续
		int num = -1;
		
	
		System.out.println("********欢迎使用吃货联盟订餐系统********");
		do {
			System.out.println("***********************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("***********************************");

			System.out.println("请选择序号：");
			int choose = scanner.nextInt();

			//定义标记符
			boolean isExit = false;
			boolean isFull = true;
			boolean isFind = false;
			
			
			//判定用户的选择
			switch (choose) {
			case 1:
				System.out.println("*******我要订餐*******");
				/*
				 * 分析： 餐袋是否已满
				 * 遍历某一个订单数组  null
				 */
				
				for (int i = 0; i < names.length; i++) {
					if (names[i]==null) {
						//订单未满 继续订餐
						isFull = false;
						System.out.println("请输入名字：");
						String uname = scanner.next();
						//展示菜单
						System.out.println("序号\t菜名\t\t价格");
						//遍历菜单
						for (int j = 0; j < dishName.length; j++) {
							String p = praise[j]==0 ? "":praise[j]+"赞";
							System.out.println((j+1)+"\t"+dishName[j]+"\t\t"+prices[j]+"\t"+p);
						}
						System.out.println("请输入菜品对应的序号");
						int dishNum = scanner.nextInt();
						//判断用户输入的菜品是否存在
						while (dishNum<1 || dishNum>dishName.length) {
							System.out.println("请输入正确的菜品序号:");
							dishNum = scanner.nextInt();
						}
						System.out.println("请输入份数");
						int number =  scanner.nextInt();
						
						System.out.println("请示如送餐的时间(送餐时间要在10点到20点之间)");
						int time = scanner.nextInt();
						while (time<10 || time>20) {
							System.out.println("请输入正确的送餐时间");
							 time = scanner.nextInt();
						}
						System.out.println("请输入送餐地址：");
						String add =  scanner.next();
						
						//计算总价
						
						double sumPrice = prices[dishNum-1]*number;
						//判定是否减免配送费
						int sendMoney = 6;
						if (sumPrice>50) {
							sendMoney = 0;
						}
						double totalprice = sumPrice>50 ? sumPrice: sumPrice+sendMoney;
						
						System.out.println("订餐成功！");
						String dishInfo = dishName[dishNum-1]+" "+number+"份";
						System.out.println("您订的是："+dishInfo);
						System.out.println("送餐时间："+time);
						System.out.println("送餐地址："+add);
						System.out.println("餐费: "+sumPrice+"送餐费："+sendMoney+"总计： "+totalprice);
					
					   //保存信息
						names[i]= uname;
						dishMsg[i] = dishInfo;
						times[i] = time;
						address[i] = add;
						sumPrices[i] = totalprice;
						break;
					}	
				}
				
				//判定餐袋是否已满
				if (isFull) {
					System.out.println("餐袋已满，请删除订单！");
				}
				break;
			case 2:
				System.out.println("*******查看餐袋*******");
				//遍历订单
				System.out.println("序号\t订餐人\t餐品信息\t\t时间\t地址\t\t总价\t状态");
				for (int i = 0; i < names.length; i++) {
					if (names[i]!=null) {
						String state = states[i]==0 ?"已预订":"已完成";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMsg[i]+"\t"+times[i]+"点\t"+address[i]+"\t"+sumPrices[i]+"\t"+state);
					}
				}
				break;
			case 3:
				System.out.println("*******签收订单*******");
				/**
				 * 判定订单是否存在
				 * 1.存在  判定 是否签收
				 * 2.不存在  提示用户 
				 */
				System.out.println("请输入签收的订单号：");
				int orderNum = scanner.nextInt();
				for (int i = 0; i < names.length; i++) {
					if(names[i]!=null&&states[i]==0&& i==orderNum-1) {
						states[i]=1;
						System.out.println("签收成功！");
						isFind=true;
					}else if (names[i]!=null&&states[i]==1&& i==orderNum-1) {
						isFind=true;
						System.out.println("订单已签收,不能重复签收");
					}
					
				}
				if (isFind==false) {	
					System.out.println("订单不存在");
				}
				break;
			case 4:
				System.out.println("*******删除订单*******");
				/**
				 * 判定订单是否存在
				 * 1.存在   已签收  可删除 未签收 不能删除
				 * 2.不存在
				 */
				System.out.println("请输入删除订单号：");
				int delNum = scanner.nextInt();
				for (int i = 0; i < names.length; i++) {
					if(names[i]!=null&&states[i]==0&& i==delNum-1) {
						System.out.println("订单未签收，不能删除！");
						isFind=true;
					}else if (names[i]!=null&&states[i]==1&& i==delNum-1) {
						isFind=true;
						for (int j = i; j < states.length-1; j++) {
							names[j] = names[j+1];
							dishMsg[j] =dishMsg[j+1];
							times[j] = times[j+1];
							address[j] = address[j+1];
							sumPrices[j] = sumPrices[j+1];
							states[j] = states[j+1];
						}
						
						//置空最后一个元素
						names[states.length-1] = null;
						dishMsg[states.length-1] =null;
						times[states.length-1] = 0;
						address[states.length-1] = null;
						sumPrices[states.length-1] = 0;
						states[states.length-1] = 0;
						System.out.println("删除成功！");
					}
				}
				if (isFind==false) {	
					System.out.println("订单不存在");
				}
				break;
			case 5:
				System.out.println("*******我要点赞*******");
				//展示菜单
				System.out.println("序号\t菜名\t\t价格");
				//遍历菜单
				for (int j = 0; j < dishName.length; j++) {
					String p = praise[j]==0 ? "":praise[j]+"赞";
					System.out.println((j+1)+"\t"+dishName[j]+"\t\t"+prices[j]+"\t"+p);
				}
				System.out.println("请输入要点赞的菜品序号：");
				int dnum = scanner.nextInt();
				while (dnum<1 || dnum>dishName.length) {
					System.out.println("请输入正确的要点赞的菜品序号：");
					dnum = scanner.nextInt();
				}
				
				//遍历菜单
				for (int i = 0; i < dishName.length; i++) {
					if (dnum-1==i) {
						praise[i]++;
						System.out.println("点赞成功！");
					}
				}
				break;
			case 6:
				System.out.println("*******退出系统*******");
				isExit = true;
				break;
			default:
				isExit = true;
				break;
			}
			if (isExit) {
				break;
			}else {
				System.out.println("请输入0返回：");
				num = scanner.nextInt();
			}
			
		} while (num == 0);

		System.out.println("谢谢使用吃货联盟订餐系统，欢迎下次使用！");
		scanner.close();
	}

}
