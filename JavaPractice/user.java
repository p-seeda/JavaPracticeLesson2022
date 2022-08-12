
public class user {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// Interview Question
		//Suppose there are 3 users and if you assign one reference variable to another variable, what will be the end result?
		
		user u1 = new user();
		u1.name = "Tom";
		u1.age = 23;
		u1.city = "Chicago";
		user u2 = new user();
		u2.name = "Saira";
		u2.age = 28;
		u2.city = "LA";
		user u3 = new user();
		u3.name = "Risa";
		u3.age = 25;
		u3.city = "NewYork";
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " +u3.city);
		
		System.out.println("-----------------------------------------");
		
		u1=u2;
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " +u3.city);
		
		System.out.println("-----------------------------------------");
		
		u2=u3;
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " +u3.city);
		System.out.println("-----------------------------------------");
		
		u3=u1;
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " +u3.city);
	}

}
