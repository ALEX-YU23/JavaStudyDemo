package org.reflect.exer;

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

	

	@Override
	public String toString() {
		return "Dog [strain=" + strain + ", getName()=" + getName() + ", getSex()=" + getSex() + ", getHealth()="
				+ getHealth() + ", getLove()=" + getLove() + "]";
	}

	public void sayName() {
		System.out.println("我要尿尿了");
	}
	
	public void sayName(Integer gg,String ii) {
		System.out.println("我要尿尿了"+gg+ii);
	}
	
	private void pup() {
		System.out.println(super.getName());
	}
}
