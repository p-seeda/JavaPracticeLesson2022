package AccessModifier;

public class BMW extends Car{

	public static void main(String[] args) {
    
		BMW b= new BMW();
		// Same packate- subclass
		// public, protected and default properties can access
		b.Modal = "Sedan";  // public
		b.price = 65000; // protected
		b.licenceno = "KL-33233";  // default
		
		// private is not allowed on subclass
	
	}

}
