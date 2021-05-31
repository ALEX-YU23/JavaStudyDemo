package org.jgs.carrentsysv2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @Description 轿车类：车牌号、品牌、日租金、型号
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月29日下午5:25:46
 */
@NoArgsConstructor
@Setter
@Getter
public class Car extends Vehicle {

	private String model ;

	public Car(String carNum,String brand,double dailyRent,String model,boolean isRent) {
		super(carNum, brand, dailyRent,isRent);
		this.model = model;
	}
	
	@Override
	public double calMoney(int days){
		double money = super.getDailyRent()*days;
		if (days>150) {
			money = super.getDailyRent()*0.7*days;
		}else if(days>30) {
			money = super.getDailyRent()*0.8*days;
		}else if(days>7) {
			money = super.getDailyRent()*0.9*days;
		}
		return money;
	}

	@Override
	public String toString() {
		return "Car [ "+ super.toString() +" model=" + model + "]";
	}

	
	
	
	
}
