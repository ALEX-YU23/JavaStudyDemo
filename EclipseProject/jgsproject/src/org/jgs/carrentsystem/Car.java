package org.jgs.carrentsystem;

/**
 * 
 * @Description 轿车类：车牌号、品牌、日租金、型号
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月29日下午5:25:46
 */
public class Car extends Vehicle implements VehicleServe {

	private String model ;

	public Car() {
		super();
	}

	public Car(String carNum, String brand, double dailyRent,String model) {
		super(carNum, brand, dailyRent);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public double calMoney(int days) throws Exception {
		double discount = 1;
		if (days>150) {
			discount = 0.7;
		}else if(days>30) {
			discount = 0.8;
		}else if(days>7) {
			discount = 0.9;
		}else if(days<=7) {
			discount = 1;
		}else {
			throw new Exception("天数不能少于1");
		}
		return super.getDailyRent()*discount*days;
	}

	
	
	
	
}
