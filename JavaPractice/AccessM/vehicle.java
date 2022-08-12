package AccessM;

import AccessModifier.Car;

public class vehicle extends Car{

	public static void main(String[] args) {
//Different package subclass
		// only public and protected properties can access
		vehicle vh = new vehicle();
		vh.Modal = "ML332";
		vh.price = 7732;
		
	}

}
