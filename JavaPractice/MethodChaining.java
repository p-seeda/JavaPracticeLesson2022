
public class MethodChaining {
	
	public void m1()
	{
		System.out.println("m1 Method");
		m2();
	}
	public void m2()
	{
		System.out.println("m2 Method");
		m3();
	}
	public void m3()
	{
		System.out.println("m3 Method");
		m4();
	}
	public void m4()
	{
		System.out.println("m4 Method");
	}

	public static void main(String[] args) {
		MethodChaining obj = new MethodChaining();
		obj.m1();

	}

}
