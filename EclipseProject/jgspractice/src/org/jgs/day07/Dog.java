package org.jgs.day07;

public class Dog extends Pets {
	private String strain ;

	public Dog() {
		super();
	}

	public Dog(String name, int health, int love,String strain) {
		super(name, health, love);
		this.strain = strain ;
		
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
}
