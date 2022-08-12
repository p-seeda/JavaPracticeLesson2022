
public class EmployeeClass {
	// Every class have some data members. these data members can be variables / methods
	
	String name;
	int id;
	int age;
	double salary;

	public static void main(String[] args) {
		
		
		EmployeeClass emp =new EmployeeClass();
		// new EmployeeClass - is the Object, emp- is the refernce name and EmployeeClass- is the class
		
		emp.name = "Pooja";
		emp.id   = 101;
		emp.age   = 26;
		emp.salary  = 100.50;
		
		System.out.println(emp.name + "," + emp.id + "," +emp.age + "," + emp.salary);
		
		EmployeeClass emp2 = new EmployeeClass();
		emp2.name = "Ajman";
		emp2.id   = 102;
		emp2.age   = 24;
		emp2.salary  = 108;
		System.out.println(emp2.name + "," + emp2.id + "," +emp2.age + "," + emp2.salary);
		EmployeeClass emp3 = new EmployeeClass();
		emp3.name = "Rahul";
		emp3.id   = 103;
		emp3.age   = 20;
		emp3.salary  = 74;
		System.out.println(emp3.name + "," + emp3.id + "," +emp3.age + "," + emp3.salary);
		
		EmployeeClass emp4 = new EmployeeClass();
		emp4.name = "Ravi";

		emp4.salary  = 70;
		System.out.println(emp4.name + "," + emp4.id + "," +emp4.age + "," + emp4.salary);
		
		// Is it possible to create an object without a reference name ? Yes its possible . No error message will display
		//No reference
		new EmployeeClass();
		new EmployeeClass().name = "Savitha";
		new EmployeeClass().age  = 49;
		// Notes: this is not a good practice to create the objects without any reference name, because 
		// each time you create an object will take memory allocation in JAVA unnecessarily. 
		
		//Null Reference
		EmployeeClass emp5 = new EmployeeClass();
		emp5 = null;
		emp5.id=104;
		// o/p :-Cannot assign field "id" because "emp5" is null . Known as Null pointer exception
		
		
		
	}

}
