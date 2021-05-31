package org.jgs.oop.day11;
/*
 * 轿车类
 */
public class Car extends AutoMobile{
	private String  type;//型号

	public Car() {
	}
	
	public Car(String carId,String brand, String type,int perRent) {
		super(brand, carId, perRent);
		this.type = type;
	}

	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//租金
	@Override
	public double rentPrice(int days) {
		double price = this.getPerRent()*days;
		if(days>90) {
			price*=0.7;
		}else if(days>30) {
			price*=0.8;
		}else if(days>7) {
			price*=0.9;
		}
		return price;
	}

}
