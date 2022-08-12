package Superkeyword;

public class BMW extends Car{
	
	int price = 300;
	
	public BMW()
	{
		//super ("Audi"); // Calling the constructor using super keyword
		System.out.println("BMW-----------Constructor"); // default super keyword bydefault created for the constructor
	}
	@Override
	public void Start()
	{
		System.out.println("BMW----- Start");
		super.Start();
	}
	
	public void Price()
	{
		System.out.println(price);
		System.out.println(super.price);
		int x = super.price;
		System.out.println(x+price);
		
	}
	
}
