// How to call static variable
public class car {
	
	String name;
	String color;
	int price;
	static int wheels = 4;

	public static void main(String[] args) {
		
car C = new car();
C.name = "Honda";
C.color = "Blue";
C.price = 35;

System.out.println(C.name + " " + C.color + " " + C.price +" "+ car.wheels);
	// how to access static vars?
// 1. by calling directly

System.out.println(wheels);	

//2. by using class name
System.out.println(car.wheels);

//3. by using object reference name // not preferable

System.out.println(C.wheels);
		
	}

}
