package org.jgs.day06;

public class Pets {

	private String name ;
	private byte type ;
	private byte gender ;
	private byte healthScore ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
		if (type == 1 || type == 2) {
			this.type = type;
		}else {
			this.type = 1;
		}
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public byte getHealthScore() {
		return healthScore;
	}
	public void setHealthScore(byte healthScore) {
		if (healthScore >= 0 || healthScore <= 100) {
			this.healthScore = healthScore;
		}else {
			this.healthScore = 60;
		}
		
	}
	
}
