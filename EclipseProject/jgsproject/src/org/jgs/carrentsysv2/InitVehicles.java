package org.jgs.carrentsysv2;

import java.util.ArrayList;

import org.junit.Test;

public class InitVehicles {

	private static ArrayList<Vehicle> vehs = new ArrayList<Vehicle>();
	
	static {
		vehs.add(new Car("京NY28588", "宝马", 800, "X6" ,false));
		vehs.add(new Car("京CNY3284", "宝马", 600, "550i",false));
		vehs.add(new Car("京NT37465", "别克", 300, "林荫大道",false));
		vehs.add(new Car("京NT96968", "别克", 600, "GL8",false));
		vehs.add(new PassengerCar("京6566754", "金杯", 800, 16,false));
		vehs.add(new PassengerCar("京8696993", "金龙", 800, 16,false));
		vehs.add(new PassengerCar("京9696996", "金杯", 1500, 34,false));
		vehs.add(new PassengerCar("京8696998", "金龙", 1500, 34,false));
	}
	
	// 租赁业务
	
	public void rentSever() {
		
	}
	
	@Test
	public void test() {
//		InitVehicles initVehicles = new InitVehicles();
//		System.out.println(vehs.get(0));
		vehs.stream().filter(x->(x instanceof Car)).forEach(x->System.out.println(x));
	}
}
