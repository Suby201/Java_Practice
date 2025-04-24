package workshop.animal.control;

import workshop.animal.entity.*;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		Cat cat1 =new Cat();
		Pet cat2 = new Cat();
		Animal cat3 = new Cat();
		
		cat1.setName("도리");
		System.out.println(cat1.getName());
		cat1.play();
		cat1.eat();
		cat1.walk();
		
		cat2.setName("냥이");
		System.out.println(cat2.getName());
		cat2.play();
		
		cat3.walk();
		cat3.eat();
	}

}
