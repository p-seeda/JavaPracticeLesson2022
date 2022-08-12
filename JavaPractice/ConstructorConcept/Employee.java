package ConstructorConcept;

public class Employee {
	//Global VAR.
	String name;
	int age;
	double sal;
	boolean isPerm;
	
	//create a constuctor with same class name to initialize the class variable
	
	public Employee()
{
	//System.out.println("I'm a void constuctor");
}
	
	
	public Employee(String name, int age)
	{
	//System.out.println(name + ","+ age);	
		this.name= name;
		this.age = age;
	}
	
	
	public Employee(int a , int b)
	{
	//	System.out.println(a+b);
	}

	public static void main(String[] args) {
		//create a new object to call the var.
		
//		Employee em = new Employee();
//		em.name = "Praseeda";
//		em.age = 44;
//		em.sal = 68.75;
//		em.isPerm = true;
//		System.out.println(em.name + ", "+em.age +","+ em.sal + ","+ em.isPerm);
//		
//		Employee em2 = new Employee();
//		em2.name = "Ganga";
//		em2.age = 18;
//		
//		System.out.println(em2.name + ", "+em2.age +","+ em2.sal + ","+ em2.isPerm);
		
	// Print the void constructor, just create an object will call the constuctor. for eg:
		
		Employee Em3 = new Employee();
		
		Employee em4 = new Employee("Prasi", 34);	
		System.out.println(em4.name + ","+ em4.age);	

//		Employee em5 = new Employee(56,33);
//		Employee em6 = new Employee (333,44);
	Employee em7 = new Employee ("Krish", 43);
		System.out.println(em7.name + ","+ em7.age);

	}

}
