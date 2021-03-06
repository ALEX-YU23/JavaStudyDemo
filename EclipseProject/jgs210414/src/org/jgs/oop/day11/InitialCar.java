package org.jgs.oop.day11;
/*
 * 初始化汽车资源
 */
public class InitialCar {

	private static  AutoMobile[]  autoMobiles = new AutoMobile[8];
	static {
		
		autoMobiles[0] = new Car("京NY28588", "宝马", "X6",800);
		autoMobiles[1] = new Car("京CNY3284", "宝马", "550i",600);
		autoMobiles[2] = new Car("京NT96968", "别克", "GL8",600);
		autoMobiles[3] = new Car("京NT37465", "别克", "林荫大道",300);
		autoMobiles[4] = new Bus("京6566754", "金杯", 16,800);
		autoMobiles[5] = new Bus("京8696997", "金龙", 16,800);
		autoMobiles[6] = new Bus("京9696996", "金杯", 34,1500);
		autoMobiles[7] = new Bus("京8696998", "金龙", 34,1500);
		
	}
	
	//根据 品牌 型号  座位数  获取对应的汽车
	public  AutoMobile  getAutoMobile(String brand,String type,int seats) {
		//遍历汽车数组
		for (int i = 0; i < autoMobiles.length; i++) {
			//判定汽车类型
			if( autoMobiles[i] instanceof Car) {
				Car car = (Car)autoMobiles[i];//向下造型
				if(car.getBrand().equals(brand)&&car.getType().equals(type)) {
					return car;
				}

			}else if(autoMobiles[i] instanceof Bus) {
				Bus bus = (Bus)autoMobiles[i];//向下造型
				if(bus.getBrand().equals(brand)&&bus.getSeats()==seats) {
					return bus;
				}
			}
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
}
