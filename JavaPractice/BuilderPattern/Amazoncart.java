package BuilderPattern;

public class Amazoncart {
	
	public Amazoncart login()
	{
		System.out.println("Please login with valid credentials");
		return this;
	}
	public Amazoncart login(String un, String pw)
	{
		System.out.println("Login with " + un + " " + pw);
		return this;

	}
	
	public Amazoncart search() {
		System.out.println("display all the products");
		return this;

	}
	public Amazoncart search(String Prod) 
	{
		System.out.println("Display all the products :" + Prod);
		return this;

	}
	public Amazoncart search(String Prod,double price)
	{
		System.out.println("Display all the products :" + Prod + " - " + price);
		return this;


	}
	public Amazoncart search(String Prod, String color, double price, char size)
	{
		System.out.println("Display all the products :" + Prod + ", "+ color + ", " + price + ", " + size);
		return this;


	}
	
	public Amazoncart addToCart()
	{
		System.out.println(" Your product is added to the Cart " );
		return this;

	}
	
	public Amazoncart doPayment(String cc, int cvv)
	{
		System.out.println( "Please enter cc  and cvv to finish purchasing " + cc + " " + cvv);
		return this;

	}
	
	public Amazoncart doPayment(int varcode)
	{
		System.out.println("Enter Varification code " + varcode);
		return this;

	}
	
}
