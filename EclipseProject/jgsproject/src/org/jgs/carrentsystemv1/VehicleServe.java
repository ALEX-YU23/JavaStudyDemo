package org.jgs.carrentsystemv1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleServe {
	/**
	 * 
	 * @Description 初始化客车资源
	 * @author AlexYU 
	 * @date 2021年5月7日下午3:35:06
	 * @return
	 */
	public static PassengerCar[] initPassengerCars() {

		PassengerCar[] pCars = new PassengerCar[4];

		pCars[0] = new PassengerCar("京6566754", "金杯", 800, 16);
		pCars[1] = new PassengerCar("京8696993", "金龙", 800, 16);
		pCars[2] = new PassengerCar("京9696996", "金杯", 1500, 34);
		pCars[3] = new PassengerCar("京8696998", "金龙", 1500, 34);

		return pCars;
	}

	/**
	 * 
	 * @Description 初始化轿车资源
	 * @author AlexYU 
	 * @date 2021年5月7日下午3:34:28
	 * @return
	 */
	public static Car[] initCars() {
		Car[] cars = new Car[4];

		cars[0] = new Car("京NY28588", "宝马", 800, "X6");
		cars[1] = new Car("京CNY3284", "宝马", 600, "550i");
		cars[2] = new Car("京NT37465", "别克", 300, "林荫大道");
		cars[3] = new Car("京NT96968", "别克", 600, "GL8");

		return cars;
	}

	/**
	 * 
	 * @Description 根据输入获得车库中车的品牌(0),型号(1),座位数(2)
	 * @author AlexYU 
	 * @date 2021年5月7日下午3:35:38
	 * @param arr 汽车数组
	 * @param choose 品牌(0),型号(1),座位数(2)
	 * @return
	 */
	public static String[] getMessage(Vehicle[] arr,int choose) { // 获得车的品牌(0),型号(1),座位数(2)

		HashSet<String> hashSet = new HashSet<String>();
		for (Vehicle i : arr) {
			switch (choose) {
			case 0:
				hashSet.add(i.getBrand());
				break;
			case 1:
				hashSet.add(((Car)i).getModel());
				break;
			case 2:
				hashSet.add(((PassengerCar)i).getSeatNum()+"");
				break;

			default:
				break;
			}
			
		}
		String[] newArr = new String[hashSet.size()];
		int index = 0;
		for (String i : hashSet) {
			newArr[index++] = i;
		}
		return newArr;
	}
	
	/**
	 * 
	 * @Description 根据选择的参数获得特定的车组
	 * @author AlexYU 
	 * @date 2021年5月7日下午3:37:59
	 * @param arr
	 * @param msg  品牌(0),型号(1),座位数(2)
	 * @param choose 品牌(0),型号(1),座位数(2)
	 * @return
	 */
	public static Vehicle[] delMessage(Vehicle[] arr,String msg,int choose) {// 获得车的品牌(0),型号(1),座位数(2)
		int nlen = 0;
		for (int i = 0; i < arr.length; i++) {
			
			switch (choose) {
			case 0:
				if(arr[i].getBrand()==msg) {
					nlen++;
				}
				break;
			case 1:
				if(((Car)arr[i]).getModel()==msg) {
					nlen++;
				}
				break;
			case 2:
				if((((PassengerCar)arr[i]).getSeatNum()+"").equals(msg)) {
					nlen++;
				}
				break;

			default:
				break;
			}
			
			
		}
		Vehicle[] newVeh = new Vehicle[nlen];
		for (int i = 0,j=0; i < arr.length; i++) {
			
			switch (choose) {
			case 0:
				if(arr[i].getBrand()==msg) {
					newVeh[j] = arr[i];
					j++;
				}
				break;
			case 1:
				if(((Car)arr[i]).getModel()==msg) {
					newVeh[j] = arr[i];
					j++;
				}
				break;
			case 2:
				if((((PassengerCar)arr[i]).getSeatNum()+"").equals(msg)) {
					newVeh[j] = arr[i];
					j++;
				}
				break;

			default:
				break;
			}
			
		}
		
		return newVeh;
	}

	/**
	 * 
	 * @Description 展示车库车辆数
	 * @author AlexYU 
	 * @date 2021年5月7日下午3:39:39
	 * @param cars
	 */
	public static void pVehicle(Vehicle[] cars) {
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}
	
	/**
	 * 
	 * 
	 * 输入错误时打印提示语
	 * param:扫描器
	 */ 
	public static int printPrompt(Scanner scan) {
		int type = 0;
		try {
			type = scan.nextInt();
			while (type<1||type>2) {
				System.out.print("您的输入有误,请重新输入:");
				type = scan.nextInt();
			}
			return type;
		} catch (InputMismatchException e) {
			System.err.println("您输入的不是数字，系统自动退出！！！！");
			System.exit(0);
		}
		
		return 0;
		
	}

	/**
	 * 获得并展示在上一句限定条件下车库中有的车类
	 */
	public static String[] showMsg(Vehicle[] cars,int choice) {
		
		String[] brand = VehicleServe.getMessage(cars,choice);
		
		for (int i = 0; i < brand.length; i++) {
			System.out.print((i+1)+"、"+brand[i] + " ");
		}
		return brand;
	}
	
	/**
	 * 根据选择留下符合条件的车子
	 */
	public static Vehicle[] chooseCar(Scanner scan,Vehicle[] cars,String[] seatnum,int choice) {
		int label = VehicleServe.printPrompt(scan);
		cars = VehicleServe.delMessage(cars, seatnum[label-1],choice);
		return cars;
	}
	
	
	
	
}
