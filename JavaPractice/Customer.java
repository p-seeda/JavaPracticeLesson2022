
public class Customer {
	//Method  OR Funtion
	// Method having no i/p or no return 
	public void test()
	{
		System.out.println("Test Method ......");
	}
	
	public void sum()
	{
		int a=70;
		int b=30;
		int x = a+b;
		System.out.println("sum is " + x);
	}
	
	// Method having no input and some return
	
	public int getNumber()
	{
		System.out.println("Get number ..........");
		int num1 = 100;
		int num2 = 200;
		int sum = num1+num2 ;
		return sum;
	}
	
	public String usernames()
	{
		String name1 = "Usha";
		String name2 = "Leena";
		String name3 = null;
		System.out.println(name1 + " & " + name2 + " & "+ name3);
		return name3;
	}
	
	   // Some i/p and some o/p
	
	public int add(int m, int n)
	{
		int sum= m+n;
		return sum;
	}
	
	
	// Student Marks
	
	public int getMarks(String studentName)
		
	{
		
		System.out.println("Student Name is  " + studentName);
		if(studentName.equals("Aman")) {
			return 98;
	} 
	
	else if (studentName.equals("Saira"))
	{
		return 89;
		}
		
	else if (studentName.equals("Prasi"))
	{
		return 90;
	}
	else
	{
		System.out.println("This name is incorrect  Name: " + studentName);
		return -1;
	}
	}
	public int StudentMarks(String studentName)
	
	{
		int marks = -1;
		System.out.println("Student Name is  " + studentName);
		if(studentName.equals("Aman")) {
		marks = 89;
	} 
	
	else if (studentName.equals("Saira"))
	{
		marks = 99;
		}
		
	else if (studentName.equals("Prasi"))
	{
		marks = 100;
	}
	else
	{
		System.out.println("This name is incorrect  Name: " + studentName);
		
	}
		return marks;
	}

		
	
	

	public static void main(String[] args) {

// call the method into the main 
		Customer Cst = new Customer();
		Cst.test();
		
		Cst.sum();
		
       int sum=  Cst.getNumber();   
       System.out.println("Sum of the 2 values is " + sum);
       int total = sum+100-20;
       System.out.println("Total value is  " + total);
       
       String names = Cst.usernames();
       
   // Some i/p and some o/p
       
       Cst.add(100, 65);
       
     int mk = Cst.getMarks("Prasi");
     System.out.println(mk);
     
     int mark = Cst.StudentMarks("Prasi");
     System.out.println(mark);
 
	}

}
