package org.jgs.carrentsysv2;

import java.util.ArrayList;

public class User extends Person {
	
	
	private ArrayList<Vehicle> uvehsList;
	
	public User() {
		super();
	}
	public User(String name, String id, double money) {
		super(name, id, money);
	}
	
	public ArrayList<Vehicle> getUvehsList() {
		return uvehsList;
	}
	public void setUvehsList(ArrayList<Vehicle> uvehsList) {
		this.uvehsList = uvehsList;
	}
	/**
	 * 
	 * @Description 租车
	 * @author AlexYU 
	 * @date 2021年5月8日下午4:56:34
	 * @param vehicle
	 * @param money
	 */
	public void rentVehicle(Vehicle vehicle,double money) {
		this.uvehsList.add(vehicle);
		setMoney(getMoney()-money);
	}
	/**
	 * 
	 * @Description 还车
	 * @author AlexYU 
	 * @date 2021年5月8日下午4:57:46
	 * @param vehicle
	 */
	public void vehicleBack(Vehicle vehicle) {
		uvehsList.remove(vehicle);
		
	}
	public void addMoney(double money) {
		setMoney(getMoney()+money);
	}
}
