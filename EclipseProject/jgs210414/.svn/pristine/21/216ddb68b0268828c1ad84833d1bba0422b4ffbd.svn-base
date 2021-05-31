package org.jgs.oop.day11;
/*
 * 客车类
 */
public class Bus extends AutoMobile{
	
	private int  seats;

	public Bus() {
		
	}


	public Bus(String carId,String brand,  int seats, int perRent) {
		super(brand, carId, perRent);
		this.seats = seats;
	
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	@Override
	public double rentPrice(int days) {
		double price = this.getPerRent()*days;
		if(days>=150) {
			price*=0.6;
		}else if(days>=30) {
			price*=0.7;
		}else if(days>=7) {
			price*=0.8;
		}else if(days>=3) {
			price*=0.9;
		}
		return price;
	}
	
	

}
