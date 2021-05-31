package org.jgs.oop.day11;

import java.util.Scanner;
/*
 * 租赁业务类
 */
public class RentSystem {

	public static void main(String[] args) {
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********欢迎使用一元汽车租赁公司***************");
		System.out.println("1.轿车 \t  2.客车");
		System.out.println("请选择您租赁的汽车类型:");
		int choose = scanner.nextInt();

		while (choose != 1 && choose != 2) {
			System.out.println("请选择正确的租赁汽车类型:");
			choose = scanner.nextInt();
		}

		//判定用户的选择 执行不同的业务逻辑
		String brand = "";
		String type = "";
		int seats = 0;
		if (choose == 1) { //轿车的业务
			System.out.println("请选择租赁的轿车品牌：1.宝马 \t   2.别克");
			int num = scanner.nextInt();
			while (num != 1 && num != 2) {
				System.out.println("请选择正确的租赁汽车品牌:");
				num = scanner.nextInt();
			}
			brand = (num == 1) ? "宝马" : "别克";
			if ("宝马".equals(brand)) {
				System.out.println("请选择租赁汽车型号：1. X6 \t 2.550i");
				num = scanner.nextInt();
				while (num != 1 && num != 2) {
					System.out.println("请选择正确的租赁汽车型号:");
					num = scanner.nextInt();
				}
				type = (num == 1) ? "X6" : "550i";
			} else {
				System.out.println("请选择租赁汽车型号：1.林荫大道 \t 2.GL8");
				num = scanner.nextInt();
				while (num != 1 && num != 2) {
					System.out.println("请选择正确的租赁汽车型号:");
					num = scanner.nextInt();
				}
				type = (num == 1) ? "林荫大道" : "GL8";	
			}

		} else {//客车业务
			System.out.println("请选择租赁的客车品牌：1.金杯 \t   2.金龙");
			int num = scanner.nextInt();
			while (num != 1 && num != 2) {
				System.out.println("请选择正确的租赁汽车品牌:");
				num = scanner.nextInt();
			}
				brand = (num == 1) ? "金杯" : "金龙";
				System.out.println("请选择租赁汽车座位数：1. 16 \t 2.34");
				num = scanner.nextInt();
				while (num != 1 && num != 2) {
					System.out.println("请选择正确的租赁汽车座位数:");
					num = scanner.nextInt();
				}
				seats = (num == 1) ? 16:34;
			} 
				//根据用户输入的 信息 获取唯一的汽车
				//初始化汽车资源
				InitialCar initialCar = new InitialCar();
				AutoMobile autoMobile = initialCar.getAutoMobile(brand, type, seats);
				System.out.println("请输入租赁的天数：");
				int days = scanner.nextInt();
				//计算租金
				double prices = 0;
				if(autoMobile instanceof Car) {
					Car car = (Car)autoMobile;
					prices = car.rentPrice(days);
				}else if (autoMobile instanceof Bus){
					Bus bus = (Bus)autoMobile;
				   prices = bus.rentPrice(days);
				}
				System.out.println("租金是："+prices);
				System.out.println("您的租赁的车牌号是："+autoMobile.getCarId());
		}
	}

