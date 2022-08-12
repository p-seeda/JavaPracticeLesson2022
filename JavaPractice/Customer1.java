
public class Customer1 {
	//Methods with no input and no return
	
	public void names()
	{
		String n1 = "Suja";
		String n2 = "Rehan";
				System.out.println(n1 + " "+ n2);
				
				}
	
	public void calc()
	{
		int x= 400;
		int y = 300;
		int z= x+y;
		System.out.println(z);
	}
	
	// Methods with No input and some return
	
	public int calc2() {
		int l= 23;
		int w = 45;
		int total = l+w;
		//System.out.println(total);
		return total;
	}
	
	public String empName()
	{
		String name = "Vijay";
		String job = "IT Specialist";
		String ID = "102";
		 //String EmpInfo = name + ID+ job;
		// return EmpInfo;
		
		//return name;
		//return job;
		return name;
	}
	
	// Methods with Some Input and Some Return
	
	public int empSal(int p, int q)
	{
	 System.out.println("Employee Sal ......");
	 int r= p+q;
	 return r;
	}
	
	public String userInfo(String un, String pw)
	{
		System.out.println("Print user name and Password -----");
		
		System.out.println("Username is :" + un + "  Password is :  " + pw);
		return un;
	}
	
	
//	WAF: Name - getMarks
//	i/p parameter : student name (string)
// o/p Student marks (integer)
	
	public void getMarks(String studentName)
	{
		if(studentName.equals("Bibi"))
		{
			int bibi = 50;
			System.out.println("Bibi - " + bibi);
			System.out.println("Grade = F");
		}
		else if (studentName.equals("Maya"))
		{
			int maya = 85;
			System.out.println("Maya - " + maya);
			System.out.println("Grade = A++");
		}
		else if( studentName.equals("Kamala"))
		{
			int kamal = 78;
			System.out.println("Kamala - " + kamal);
			System.out.println("Grade = C");
		}
	}

	public static void main(String[] args) {
		
		
		Customer1 cs1 = new Customer1 ();
		cs1.names();
		cs1.calc();
		// you can create a int type variable because there is a return type involved.
		int cs = cs1.calc2();
		System.out.println(cs);
		System.out.println(cs+ 100*2);
		
		System.out.println(cs1.calc2());  // Another way of calling method results
		
		String info = cs1.empName();
		System.out.println(info);
		
		System.out.println(cs1.empName());
		
		int r1= cs1.empSal(1000, 2000);
		System.out.println(r1);
		
		int r2 = cs1.empSal(4000,2500);
		System.out.println(r2+500);
		
		String un1 = cs1.userInfo("Praseeda", "Passxxword");
		String un2 = cs1.userInfo("Alex", "worldiS");
		String un3 = cs1.userInfo("Mahesh", "Pa99ss");
		
		//cs1.getMarks("Kamala");
		
		//cs1.getMarks("Bibi");
		
		cs1.getMarks("Kamala");
     
       
	}

}
