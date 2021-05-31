package org.jgs.day08;

public class Dog extends Pets {

	private String strain;
	
	
	public Dog() {
		super();
	}

	public Dog(String name,char sex,int health,int love,String strain) {
		super(name,sex,health,love);
		this.setStrain(strain);
	}


	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	
	
}
