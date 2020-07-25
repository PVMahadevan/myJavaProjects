class Person {
	
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello");
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
}

public class getterReturns {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Aswathy";
		person1.age = 25;
//		person1.speak();
		person1.getAge();
		
		String name = person1.getName();
		
		System.out.println("My name is " + name);
		 
		int age = person1.getAge();
		System.out.println("My age is " + age);
		
	
		
	}

}
