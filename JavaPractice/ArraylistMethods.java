import java.util.ArrayList;
import java.util.Collections;

public class ArraylistMethods {

	public static void main(String[] args) {
		 ArrayList<String> names = new ArrayList<String>();
		 names.add("Praseeda");
		 names.add("Ganga");
		 names.add("Mike");
		 names.add("Joe");
		 names.add("Daren");
		 names.add("Ganga");
//		 names.add(null);
//		 names.add(null);
		names.add("Nidhi");
		 
		// Add a new value in a specific index
		 names.add(6, "Prasanth");  // o/p:  will be [Praseeda, Ganga, Mike, Joe, Daren, Ganga, Prasanth]

		names.add(1, "Kavya");	 // O/P: will be [Praseeda, Kavya, Ganga, Mike, Joe, Daren, Ganga, Prasanth]
		
		names.remove("Daren");  // REmoved Daren from the list ?//O/P is [Praseeda, Kavya, Ganga, Mike, Joe, Ganga, Prasanth, Nidhi]

		names.remove(3); // Remove the 3rd index // o.p: [Praseeda, Kavya, Ganga, Joe, Ganga, Prasanth, Nidhi] //MIke is removed


	// names.add(10, "Mew");  // O/P will be IOB since there are no 11th index to add.
		 // Find the length of the arraylist
		 
		System.out.println("Length of the array is  " + names.size());
		// For each loop to print the name group in an array // following iteration
		
		for(String e:names)
		{
			System.out.println(e);
		}
		
		// Just print the arraylist without iteration
		
		System.out.println(names);
		
		System.out.println("-------------------");
		// NEw student arraylist
		 ArrayList<String> stList = new ArrayList<String>();
		 stList.add("Mohanlal");
		 stList.add("Mammotty");
		 stList.add("Fahad");
		 stList.add("Jayaram");
		 stList.add("Dulkar");
		 stList.add("Dileep");
		 
		 System.out.println(stList.size());
		 
			for(String e: stList)
			{
				System.out.println(e);
				if(e.equals("Mammotty"))
				{
					System.out.println(e + "is the best actor in Malayalam cinema");
					break;
				}
			}
			System.out.println("-------------------");	
		 
//// Print in the normal order
//		for (int i=0; i<stList.size(); i++)
//		{
//			System.out.println(stList.get(i));
//		}
		System.out.println("-------------------");
//		
//		// PRint in reverse order
//		
//		for(int j=stList.size()-1; j>=0; j--)  // j=6; 6>0; Dileep  , j=5;5>0; Dulkar , j=4;4>0; Jayaram
//			                                      
////			
////		{
////			System.out.println(stList.get(j));
//		}
//		System.out.println("-------------------");
		
		// PRint the array list
		System.out.println(stList);
		//Reverese printing with  Collections class
		
//		Collections.reverse(stList);
//		System.out.println(stList);
		
		// Swapping the two values in indexes
		Collections.swap(stList, 3, 4);
		System.out.println(stList);     //[Mohanlal, Mammotty, Fahad, Jayaram, Dulkar, Dileep]
	                                   ////[Mohanlal, Mammotty, Fahad, Dulkar, Jayaram, Dileep]
		
		// Verify List contains certain value. If it is true, print true  or false. // Validation point
		System.out.println(stList.contains("Dulkar"));
		
		// Another way of validation is that
		
		if(stList.contains("Dulkar"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("False");
		}
		System.out.println("-------------------");
		
		// Merge 2 Arraylist together using addAll
		
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("User1");
		userList.add("User2");
		userList.add("User3");
		userList.add("User4");
		userList.add("User5");
		System.out.println(userList);
		userList.addAll(stList);
		System.out.println(userList);
		
	}

}
