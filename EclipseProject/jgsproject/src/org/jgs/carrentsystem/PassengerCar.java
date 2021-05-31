package org.jgs.carrentsystem;

/**
 * 
 * @Description  客车类：车牌号、品牌、日租金、座位数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月29日下午5:16:27
 */
public class PassengerCar extends Vehicle implements VehicleServe {

	private int seatNum;
	
	public PassengerCar() {
		super();
	}
	
	public PassengerCar(String carNum, String brand, double dailyRent, int seatNum) {
		super(carNum, brand, dailyRent);
		this.seatNum = seatNum ;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + seatNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassengerCar other = (PassengerCar) obj;
		if (seatNum != other.seatNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PassengerCar [seatNum=" + seatNum + "]";
	}

	@Override
	public double calMoney(int days) throws Exception {
		double discount = 1;
		if (days>150) {
			discount = 0.6;
		}else if(days>30) {
			discount = 0.7;
		}else if(days>7) {
			discount = 0.8;
		}else if(days>3) {
			discount = 0.9;
		}else if(days<=7) {
			discount = 1;
		}else {
			throw new Exception("天数不能少于1");
		}
		return super.getDailyRent()*discount*days;
	}
	
	
	

}
