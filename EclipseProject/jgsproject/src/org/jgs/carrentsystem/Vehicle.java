package org.jgs.carrentsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @Description  汽车类：车牌号、品牌、日租金
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
	public abstract double calMoney(int days) throws Exception;
	
}
