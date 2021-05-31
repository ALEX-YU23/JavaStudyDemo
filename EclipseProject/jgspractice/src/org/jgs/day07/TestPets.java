package org.jgs.day07;

public class TestPets {

	public static void print(Pets pet) {
		pet.print();
	}
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("小黑", 80, 60, "接球");
		Penguin penguin = new Penguin("Q仔", 18, 27, '女');
//		penguin.print();
		
//		dog1.print();
		Person person = new Person("张祥", 10);
	
		person.cure(penguin);
		person.cure(dog1);
	
	}
	
	
	
	
	

}
