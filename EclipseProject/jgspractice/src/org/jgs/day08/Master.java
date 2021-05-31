package org.jgs.day08;

public class Master {

	private String name ;
	private Pets pets ;
	
	


	public Master() {
		super();
	}
	
	
	public Master(String name, Pets pets) {
		this.name = name;
		this.pets = pets;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Pets getPets() {
		return pets;
	}


	public void setPets(Pets pets) {
		this.pets = pets;
	}


	public void toHaspital(Pets pet) {
		if (pet.getHealth()<50) {
			System.out.println("宠物健康值为："+pet.getHealth()+",去医院");
		}
	
	}
	
	public void Feed(Pets pet,Food food) {
		System.out.println("喂" +pet.getName() + "吃" +food.fname);
	}

	
}
