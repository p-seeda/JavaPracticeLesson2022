package AccessModifier;

public class Car {
	public String Modal;
	private String color;
	protected int price;
	String licenceno;

	public static void main(String[] args) {
 
		Car c= new Car();
		// Same class access
		// public, private, protected and default properties can access
		c.Modal = "Honda CRV";  // public
		c.color = "blue";       // private
		c.price = 45000;        // protected
		c.licenceno ="PG-3323"; // default
	}

}
