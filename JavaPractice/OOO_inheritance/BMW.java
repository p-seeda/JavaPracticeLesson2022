package OOO_inheritance;

public class BMW extends Car {
	@Override
	public void start()
	{
		System.out.println("BMW..... Start");
		
	}
	public void autoParking()
	{
		System.out.println("BMW..... autoParking");
	}
	
	
	public void Body()
	{
		System.out.println("BMW..... Body");
	}
	@Override
	public void Engine() {
		System.out.println("BMW ---- Engine");
	}
	
}
