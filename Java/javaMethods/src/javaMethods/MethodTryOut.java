package javaMethods;

class Person {

	//Classes can contain 2 things.
	//1. Data
	//2. Subroutines (Methods)

	String name;
	int age;
	
void speak() {
	
	for (int i = 0; i < 5; i++)	{
	System.out.println("Hello");
	}

}
}

public class MethodTryOut {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Aswathy Mahadevan";
		person1.age = 24;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Mahadevan";
		person2.age = 29;
		person2.speak();

		System.out.println("The age of " + person1.name + " is " + person1.age);
		System.out.println("The age of " + person2.name + " is " + person2.age);
	}

}