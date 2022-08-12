package OOP_Encapsulation;

public class EncapEmployee {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		//em.name = "Seeda";
		em.setAge(33);
		System.out.println(em.getAge());
		em.setName("Praseeda");
		System.out.println(em.getName());
		
		Login log = new Login();
		String un = log.setUserName();
System.out.println(un);
	}

}
