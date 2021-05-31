package org.jgs.ordering;

import java.util.Scanner;

class Dish {
	private String dishName ;  // 菜品名称
	private double price ;     // 菜品单价
	private int thumbsUp = 0 ;
	
	public Dish(String dishName,double price) {
		this.dishName = dishName;
		this.price = price;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getThumbsUpStr() {
		return (thumbsUp==0)?"":thumbsUp+"赞";
	}
	public int getThumbsUp() {
		return thumbsUp;
	}
	public void setThumbsUp(int thumbsUp) {
		this.thumbsUp = thumbsUp;
	}
	public void giveThumbsUp() {
		this.thumbsUp += 1;
	}
	// 展示菜单
	
}
class Order {
	private String userName ;
	private int count ;
	private int time ;
	private String address ;
	private double sumPrice ;
	//  订单完成状态：  0是已预订  1是已完成
	private int state = 0 ;
	private Dish dish;
	public Order() {}
	public Order(String userName,Dish dish,int count,int time,String address,double sumPrice) {
		this.userName = userName;
		this.dish = dish;
		this.count = count;
		this.time = time;
		this.address = address;
		this.sumPrice = sumPrice;
	}
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(short count) {
		this.count = count;
	}
	public int getTime() {
		return time;
	}
	public void setTime(byte time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(double sumPrice) {
		this.sumPrice = sumPrice;
	}
	public int getState() {
		return state;
	}
	public String getStateStr() {
		return (state==0)?"已预订":"已完成";
	}
	public void setState(byte state) {
		this.state = state;
	}
}


public class OrderSysClass {

	public static void main(String[] args) {
		
		// 实例化扫描类
		Scanner scan = new Scanner(System.in);
		// 定义菜品
		Dish dish1 = new Dish("鱼香肉丝", 11.89);
		Dish dish2 = new Dish("黄焖鸡", 16.50);
		Dish dish3 = new Dish("时令鲜蔬", 8.89);
		// 创建菜单
		Dish[] menu = new Dish[] {dish1,dish2,dish3}; 
		
		// 初始化订单
		Order order1 = new Order("张祥",menu[0],2,12,"合肥一元啦",29.78);
		Order order2 = new Order("李辉",menu[1],1,13,"合肥一元啦",22.50);
		Order order3 = new Order("刘浩",menu[2],3,17,"合肥一元啦",32.67);
		// 创建订单列表
		Order orders[] = new Order[6] ;  
		orders[0] = order1 ;
		orders[1] = order2 ;
		orders[2] = order3 ;
		// 初始化已有订单下标
		int orderCount = 2;
		
		// 初始化送餐费
		int mealDeliveryFee = 6;
		
		// 系统结束条件
		boolean isExit = true ;
		
		do {
			
			System.out.println("\t欢迎使用“吃货联盟v3”订餐系统");
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
			
			int isBack = 1;
			
			switch (choice) {
			case 1:
				// 订餐
				// 首先判断餐袋是否已满,若满,则先删除已签收订单才能订餐
				// 若未满,就可以订餐
				orderCount ++;  // 已存在订单数加1
				if (orderCount>=orders.length) {
					System.out.println("\t您的餐袋已满,请删除已签收订单才能继续订餐!!");
					// 直接返回主菜单
					isBack = 0;
					break;
				}
				orders[orderCount] = new Order();
				scan.nextLine();  // 接收nextInt之后的换行符 
				System.out.println("\t***我要订餐***");
				// 输入订餐人姓名并保存在orders[orderCount]中
				System.out.print("\t请输入订餐人姓名：");
				orders[orderCount].setUserName(scan.nextLine());
				// 遍历展示菜单
				System.out.println("\t序号\t菜名\t\t单价");
				for (int i = 0; i < menu.length; i++) {
					System.out.println("\t" + (i+1) + "\t" +
					menu[i].getDishName() + "\t\t" + menu[i].getPrice() +
					"\t" + menu[i].getThumbsUpStr());
				}
				
				System.out.print("\t请选择您要点的菜品编号：");
				int dishName = scan.nextInt() ;
				// 判断菜品编号是否合法
				while (dishName>=menu.length||dishName<0) {
					System.out.println("\t您输入的编号有误,请重新选择您要点的菜品编号：");
					dishName = scan.nextInt() ;
				}
				// 为orders[orderCount]设置菜品
				orders[orderCount].setDish(menu[dishName-1]);
				// 输入份数并保存在orders[orderCount]中
				System.out.print("\t请选择您需要的份数：");
				orders[orderCount].setCount(scan.nextShort());
				
				// 为orders[orderCount]设置送餐时间
				System.out.print("\t请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
				byte sendTime = scan.nextByte();
				while (sendTime<10||sendTime>20) {
					System.out.print("\t您输入的时间有误,请重新输入（送餐时间是10点至20点间整点送餐）：");
					sendTime = scan.nextByte();
				}
				orders[orderCount].setTime(sendTime);
				
				// 输入送餐地址并保存在order数组[4]中
				System.out.print("\t请输入送餐地址：");
				orders[orderCount].setAddress(scan.next());
				
				System.out.println("\t订餐成功！");
				System.out.println("\t您订的是：" + orders[orderCount].getDish().getDishName() + orders[orderCount].getCount() + "份");
				System.out.println("\t送餐时间：" + orders[orderCount].getTime() + "点");
				
				// 计算总价,餐品费用大于25,免除送餐费,反之加送餐费
				double Price =  menu[dishName-1].getPrice() * orders[orderCount].getCount();
				double sumPrice = (Price>25) ? Price : Price + mealDeliveryFee;
				orders[orderCount].setSumPrice(sumPrice);
				System.out.println("\t餐费：" + String.format("%.2f", Price) +
						"元，送餐费" + ((Price>25) ? 0 : mealDeliveryFee) +
						"元，总计：" + sumPrice + "元。");
				
				break;
			case 2:
				// 查看餐袋
				System.out.println("\t***查看餐袋***");
				System.out.println("\t序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i <= orderCount; i++) {
					System.out.printf("\t" + (i+1));
					System.out.print("\t" + orders[i].getUserName());
					System.out.print("\t" + orders[i].getDish().getDishName() + orders[i].getCount()+"份" );
					System.out.print("\t" + orders[i].getTime() + "点");
					System.out.print("\t" + orders[i].getAddress());
					System.out.print("\t" + orders[i].getSumPrice());
					System.out.print("\t" + orders[i].getStateStr());
					System.out.println();
				}
				break;
			case 3:
				// 签收订单
				System.out.println("\t***签收订单***");
				System.out.print("\t请选择要签收的订单序号：");
				int signOrderNum= scan.nextInt()-1;
				while (signOrderNum<0||signOrderNum>orderCount){
					System.out.print("\t您输入的订单序号不存在，请重新选择要签收的订单序号：");
					signOrderNum = scan.nextInt()-1;
				} 
				if (orders[signOrderNum].getState()==0) {
					orders[signOrderNum].setState((byte) 1);
					System.out.println("\t订单已签收");
				}else {
					System.out.println("\t订单已经签收过了,请不要重复签收！");
				}
				
				break;
			case 4:
				// 删除订单
				System.out.println("\t***删除订单***");
				System.out.println("\t有"+(orderCount+1)+"个订单");
				// 判断还有多少订单
				if (orderCount<0) {
					System.out.println("订单已经全部删除！！");
					break;
				}
				System.out.print("\t请选择要删除的订单序号：");
				int delOrderNum = scan.nextInt();
				while ((delOrderNum<0||delOrderNum>orderCount)){
					System.out.print("\t订单号不在范围内");
					System.out.print("\t请重新选择要删除的订单序号：");
					// 订单号不在范围内并且未签收订单不能删除
					delOrderNum = scan.nextInt();
				} 
				if (orders[delOrderNum-1].getState()==0) {
					System.out.println("\t订单未签收,请先签收");
					break;
				}
				for (int i = delOrderNum-1; i <= orderCount; i++) {
					if (i == orders.length - 1 ) {
						orders[i] = null;
					} else {
						orders[i] = orders[i+1];
					}
				}
				orderCount--;
				System.out.println("\t删除订单成功！");
				break;
			case 5:
				System.out.println("\t***我要点赞***");
				System.out.println("\t序号\t菜名\t\t单价");
				for (int i = 0; i < menu.length; i++) {
					System.out.println("\t" + (i+1) + "\t" +
					menu[i].getDishName() + "\t\t" + menu[i].getPrice() +
					"\t" + menu[i].getThumbsUpStr());
				}
				int likeNum ;
				System.out.print("\t请选择您要点赞的菜品序号：");
				likeNum = scan.nextInt() - 1;
				while (likeNum<0||likeNum>=menu.length) {
					System.out.print("\t您选择的序号有误,请重新选择您要点赞的菜品序号：");
					likeNum = scan.nextInt() - 1;
					
				} 
				menu[likeNum].giveThumbsUp();
				System.out.println("\t点赞成功！");
				break;
			case 6:
				System.out.println("\t谢谢使用，欢迎下次光临！");
				isExit = false;
				break;

			default:
				System.out.println("\t暂无此功能,后续有可能更新.");
				break;
			}
			
			while (isBack!=0&&choice!=6) {
				
				System.out.print("\t输入0返回主菜单：");
				isBack = scan.nextInt();
				
			}
		} while (isExit);
		
		scan.close();
	
	}
	
}
