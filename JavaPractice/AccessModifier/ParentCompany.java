package AccessModifier;

public class ParentCompany {
	
	public void Employee()
	{
		System.out.println("Employee details");
	}
	private void dob()
	{
		System.out.println("Employee - Date of Birth");
	}
	
	protected void salary()
	{
		System.out.println("Employee Salary..");
	}
	
	void City()
	{
		System.out.println("City of the Employee");
	}

	public static void main(String[] args) {

		ParentCompany par = new ParentCompany();
		par.Employee();
		par.City();
		par.salary();
		par.dob();
		
	}

}
