package org.jgs.day08;

import org.junit.Test;

public class TestMaster {

	@Test
	public void TestMaster1() {
		Dog dog = new Dog("小黑", '雄', 30, 30,"跳");
		Master master = new Master("张祥", dog);
		master.toHaspital(dog);
		Fish fish = new Fish();
		DogFood dogFood = new DogFood();
		dog.eat(dogFood);
		dog.eat(fish);
		
		
		Cat cat = new Cat("橘猫", '女', 60, 80);
		cat.eat(fish);
		
		master.Feed(cat, dogFood);
	}
	@Test
	public void TestMaster2() {
		System.out.println("lallallall");
	}
}
