
public class Testing {
	
	public void m1()
	{
		m2();
	}
	public void m2()
	{
		m3();
	}

	public void m3()
	{
		System.out.println("Bye");
		//m1();  // memory overflow and throw *Stack overflow Error
	}


	public static void main(String[] args) {
		Testing t = new Testing();
t.m1();

t.m3();
t.m3();
	}

}
