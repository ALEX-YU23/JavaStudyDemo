package org.jgs.carrentsystem;

import java.util.HashSet;

public interface VehicleServe {
	static PassengerCar[] initPassengerCars() {

		PassengerCar[] pCars = new PassengerCar[4];

		pCars[0] = new PassengerCar("京6566754", "金杯", 800, 16);
		pCars[1] = new PassengerCar("京8696993", "金龙", 800, 16);
		pCars[2] = new PassengerCar("京9696996", "金杯", 1500, 34);
		pCars[3] = new PassengerCar("京8696998", "金龙", 1500, 34);

		return pCars;
	}

	static Car[] initCars() {
		Car[] cars = new Car[4];

		cars[0] = new Car("京NY28588", "宝马", 800, "X6");
		cars[1] = new Car("京CNY3284", "宝马", 600, "550i");
		cars[2] = new Car("京NT37465", "别克", 300, "林荫大道");
		cars[3] = new Car("京NT96968", "别克", 600, "GL8");

		return cars;
	}

	static String[] getMessage(Vehicle[] arr,int choose) { // 获得车的品牌(0),型号(1),座位数(2)

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
	
	// 根据品牌删除汽车
	static Vehicle[] delMessage(Vehicle[] arr,String msg,int choose) {// 获得车的品牌(0),型号(1),座位数(2)
//		System.out.println(brand);
//		pVehicle(arr);
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
//		System.out.println(nlen);
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

	// 打印汽车数组
	static void pVehicle(Vehicle[] cars) {
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}
	
	

}
