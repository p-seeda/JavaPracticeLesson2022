import java.util.ArrayList;

public class ArraylistConcept {

	public static void main(String[] args) {
		// ArrayList : Default class in Java .JDK
		//Collections : dynamic array
		// order/index based array list
		 // create the object of arraylist
		
		ArrayList ar = new ArrayList();
		
		ar.add(1000);
		ar.add(2000);
		ar.add(3000);
		ar.add(4000);
		ar.add(5000);
		
		System.out.println(ar.size());  // For the static array we used .length and for the the dynamic array we used .size() - Predefined
		 ar.add(6000);
		 ar.add(7000);
		 System.out.println(ar.size());
		 
		 ArrayList<String> names = new ArrayList<String>();
		 names.add("Praseeda");
		 names.add("Ganga");
		 names.add("Mike");
		 names.add("Joe");
		 
		 
		 ArrayList<Integer> no = new ArrayList<Integer>();
		 
		no.add(90);
		no.add(91);
		no.add(92);
		no.add(96);

	}

}
