package AccessModifier;

public class Cycle {

	public static void main(String[] args) {
		
		// Same package non subclass
		//public, protected and default properties can access
 Car C1 = new Car();
 C1.Modal = "2 wheeler";
 C1.price = 1000;
 C1.licenceno = "10";
 
 Cycle c2 = new Cycle();
 
	}

}
