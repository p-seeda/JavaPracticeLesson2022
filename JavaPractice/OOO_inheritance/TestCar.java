package OOO_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		b1.start();
		b1.stop();
		b1.autoParking();
		b1.Engine();
		
		System.out.println("==============");
		 Car c = new Car();
		 c.start();
		 c.stop();
		 c.Refuel();
		 
		 System.out.println("==============");
		 
//		Vehicle v = new Vehicle();
//		v.Refuel();
//		v.start();
//		v.stop();
		
	}

}
