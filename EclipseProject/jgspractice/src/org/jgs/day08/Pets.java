package org.jgs.day08;

public abstract class Pets {
	
	private String name ;
	private char sex ;
	private int health ;
	private int love ;
	
	
	public Pets() {}
	public Pets(String name,char sex,int health,int love) {
		this.name = name;
		this.sex = sex;
		this.health = health;
		this.love = love;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + health;
		result = prime * result + love;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		if (health != other.health)
			return false;
		if (love != other.love)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pets [name=" + name + ", sex=" + sex + ", health=" + health + ", love=" + love + "]";
	}
	public void eat(Food food) {
		System.out.println(this.name + "吃" +food.fname);

	}

	
}
