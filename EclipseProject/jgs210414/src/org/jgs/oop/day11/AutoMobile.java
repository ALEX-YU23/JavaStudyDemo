package org.jgs.oop.day11;
/*
 * 汽车类
 */
public abstract class AutoMobile {

	private String  brand; //品牌
	private String  carId; //车牌
	private  int    perRent;//日租金
	//计算租金
	public abstract double rentPrice(int days);
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public int getPerRent() {
		return perRent;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
	
	public AutoMobile() {
		
	}
	
	public AutoMobile(String brand, String carId, int perRent) {
		this.brand = brand;
		this.carId = carId;
		this.perRent = perRent;
	}

	@Override
	public String toString() {
		return "AutoMobile [brand=" + brand + ", carId=" + carId + ", perRent=" + perRent + "]";
	}
	
	
	
	
	
}
