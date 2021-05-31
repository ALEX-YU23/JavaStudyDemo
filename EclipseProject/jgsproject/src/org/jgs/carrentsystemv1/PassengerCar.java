package org.jgs.carrentsystemv1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @Description  客车类：车牌号、品牌、日租金、座位数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月29日下午5:16:27
 */
@NoArgsConstructor
@Setter
@Getter
public class PassengerCar extends Vehicle {

	private int seatNum;
	
	public PassengerCar(String carNum,String brand,double dailyRent,int seatNum) {
		super(carNum, brand, dailyRent);
		this.seatNum = seatNum;
	}
	
	@Override
	public double calMoney(int days)  {
		double money = super.getDailyRent()*days;
		if (days>150) {
			money = super.getDailyRent()*0.6*days;
		}else if(days>30) {
			money = super.getDailyRent()*0.7*days;
		}else if(days>7) {
			money = super.getDailyRent()*0.8*days;
		}else if(days>3) {
			money = super.getDailyRent()*0.9*days;
		}
		return money;
	}

	@Override
	public String toString() {
		return "PassengerCar ["+super.toString()+"seatNum=" + seatNum + "]";
	}
	
	
	

}
