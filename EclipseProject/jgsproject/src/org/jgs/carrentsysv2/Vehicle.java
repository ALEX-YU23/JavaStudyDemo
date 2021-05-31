package org.jgs.carrentsysv2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @Description  汽车类：车牌号、品牌、日租金、是否已被租用
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月29日下午5:08:21
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {
	private String carNum ;
	private String brand ;
	private double dailyRent ;
	private boolean isRent ;
	public abstract double calMoney(int days);
	@Override
	public String toString() {
		return "carNum=" + carNum + ", brand=" + brand + ", dailyRent=" + dailyRent + ", isRent=" + isRent ;
	}
	
	
}
