package org.jgs.carrentsystemv1;

import java.util.Scanner;

/**
 * 
 * @Description  通过用户的输入给用户合适输入
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月29日下午4:59:37
 */
public class CarRentalSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 汽车业务类实现初始化车子
		
		System.out.println("***********欢迎光临腾飞汽车租赁公司***********");
		
		System.out.println("现有待租用的汽车类型有:");
		System.out.println("1、轿车  2、客车");
		
		System.out.print("请选择你要租赁的汽车类型: ");
		// 防止用户输入错误
		int type = VehicleServe.printPrompt(scan);
		Vehicle[] cars;
		String vtype ;
		// 根据用户的输入初始化车库
		if(type==1) {
			vtype = "轿车";
			cars = VehicleServe.initCars();
		}else {
			vtype = "客车";
			cars = VehicleServe.initPassengerCars();
		}
		System.out.println("现有待租用的"+vtype+"品牌有:");
		
		// 根据选择展示车辆
		String[] brand = VehicleServe.showMsg(cars, 0);
		System.out.println();
		System.out.print("请选择你要租赁的"+vtype+"品牌: ");
		cars = VehicleServe.chooseCar(scan, cars, brand,0);
		System.out.println("车辆数："+cars.length);
		
		// 判断车子是什么类型
		switch (vtype) {
		case "轿车":
			System.out.println("现有待租用的"+vtype+"型号有:");
			String[] ty = VehicleServe.showMsg(cars, 1);
			System.out.println();
			System.out.print("请选择你要租赁的轿车型号:");
			cars = VehicleServe.chooseCar(scan, cars, ty,1);
			break;
		case "客车":
			System.out.println("现有待租用的"+vtype+"的座位数有:");
			String[] seatnum = VehicleServe.showMsg(cars,2);
			System.out.println();
			System.out.print("请选择你要租赁的客车的座位数:");
			cars = VehicleServe.chooseCar(scan, cars, seatnum,2);
			
			break;

		default:
			break;
		}
		
		System.out.print("请输入您要租赁的天数:");
		int days = scan.nextInt();
		
		double rentMoney  = 0;
		rentMoney = cars[0].calMoney(days);
		System.out.print("分配给您的汽车牌号是:");
		
		System.out.println(cars[0].getCarNum());
		System.out.println("您需要支付的租赁费用是:"+rentMoney+" 元。");
		scan.close();
		
		
		
		
	}
	
	
}
