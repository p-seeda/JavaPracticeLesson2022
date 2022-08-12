import java.util.ArrayList;
import java.util.Collections;

public class Experiments {
	
	static final String EmpcompName = "IBM";

	public static void main(String[] args) {
		

// Replace string from Best to Good
//		String Lala = "He is the Best person in the world";
//	System.out.println(Lala);
//		String Lala2= Lala.replace("Best", "Good");
//		System.out.println(Lala2);
//       //Print the string to Upper case
//		System.out.println(Lala2.toUpperCase());
//		
//		// 
//		
//		
//		System.out.println("----------------------------------------");
//		 ArrayList<String> stList = new ArrayList<String>();
//		 stList.add("Mohanlal");
//		 stList.add("Mammotty");
//		 stList.add("Fahad");
//		 stList.add("Jayaram");
//		 stList.add("Dulkar");
//		 stList.add("Dileep");
//		 
//		// System.out.println(stList.size());
//		 
//			for(String e: stList)
//			{
//				System.out.println(e);
//			if(e.equals("Mammotty"))
//			{
//			System.out.println(e + " is the best actor in Malayalam Movie");
//		}
			System.out.println("----------------------------------------");
			 ArrayList<String> EmpList = new ArrayList<String>();
			 
			 System.out.println(Experiments.EmpcompName);
			 
			 String EmpcompName = "Cognizant";
			 System.out.println(EmpcompName);
			 
			 Experiments.EmpcompName = ""
			 
			 
			 EmpList .add("Tom");
			 EmpList .add("Ray");
			 EmpList .add("Joe");
			 EmpList .add("Lopez");
			 EmpList .add("Mike");
			 EmpList .add("Dana");
			 
			 System.out.println(EmpList);
			 
			 for(int i=EmpList.size()-1; i>0;i--)
			 {
				 System.out.println(EmpList.get(i));
			 }
//			 
//			 System.out.println(EmpList);
//			 Collections.reverse(EmpList);
//			 System.out.println(EmpList);
//			 
			 Collections.swap(EmpList, 1, 3);
			 System.out.println(EmpList);
			 System.out.println("----------------------------------------");
			 
				ArrayList<String> userList = new ArrayList<String>();
				userList.add("User1");
				userList.add("User2");
				userList.add("User3");
				userList.add("User4");
				userList.add("User5");
				System.out.println(userList);
				userList.addAll(EmpList);
				System.out.println(userList);
			}
	
	
	}


