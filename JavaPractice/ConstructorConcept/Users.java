package ConstructorConcept;

public class Users {
	String name;
	int age;
 String id;
	boolean isActive;
	
	public Users(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Users(String name, String id, boolean isActive) {
		this.name = name;
		this.id = id;
		this.isActive = isActive;
	}
		
	public Users(int age, String id) {
		this.age = age;
		this.id = id;
	}

	public Users(String name, int age, String id, boolean isActive) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.isActive = isActive;
	}


	public static void main(String[] args) {
		Users u1 = new Users("Gem", "A11");
		System.out.println(u1.name + " " + u1.id);
		Users u2 = new Users("Loveeno", null, false);
		System.out.println(u2.name + " " + u2.age + " " + u2.id);
		Users u3 = new Users("Mia", 33, "B11", true);
		System.out.println(u3.name+ "," + u3.id + "," + u3.age + " , " + u3.isActive);
		Users u4 = new Users("Tomy", 22, "B13", false);
		System.out.println(u4.name+ "," + u4.id + "," + u4.age + " , " + u4.isActive);
		
		
	}

}
