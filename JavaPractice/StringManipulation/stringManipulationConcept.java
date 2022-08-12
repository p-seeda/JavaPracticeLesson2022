package StringManipulation;

import java.util.Arrays;

public class stringManipulationConcept {
	public static void main(String[]args)
	{
		String str = "This is my java class and i am so happy";
		System.out.println(str.length());
		
		// char at each position
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(17));
		
		// index of each char
		System.out.println(str.indexOf('I'));  //-1
		System.out.println(str.indexOf('y'));
		System.out.println(str.indexOf('y', 15));
		System.out.println(str.indexOf('i')); // first i
		System.out.println(str.indexOf('i', str.indexOf('i')+1)); //second i -5 // First you find the i on first index and then find the second i starting next to the index of i+1
		
		//Assignment for finding the 3rd occurance of 'i'
		System.out.println(str.indexOf('i', str.indexOf('i')+1 +  str.indexOf('i')+1)); //26
		
		// find the position of the string class
		System.out.println(str.indexOf("class")); //16
		System.out.println(str.indexOf("xyz"));  //-1
		
		// Verify Admin is displayed on the message or not
		
		String msg = "WELCOME Admin...";
		
//		if(msg.indexOf("Admin")!=-1)
//		{
//			System.out.println("Test is passed");
//		}
//		else
//		{
//			System.out.println("Test is failed");
//		}
		
		if(msg.indexOf("Admin")>0)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		//Print all strings in Upper case
		
		String java = "i love java language";
		System.out.println(java.toUpperCase());
		
		// Print all strings in lower case
		String lw = "This Is SO Awesome";
		System.out.println(lw.toLowerCase());
		
		
		// Trim the white spaces
		
		String st = "       My favorite color is:    ";
		System.out.println(st.trim());
		
		//Replace
		
		String dob = "01-01-1980";
		System.out.println(dob.replace('-', '/'));  // o/p : 01/01/1980
		
		String lol = " laugh out loud my dear friends  ";
		
		System.out.println(lol.replace(" ", "**"));
		System.out.println(lol.replace(" ", ""));
		
		// Contains - will return a boolean value
		
		String msg1 = "Welcome to java automation training";
		System.out.println(msg1.contains("java")); //true
		
		System.out.println(msg1.contains("Training")); //false
		
		if(msg1.contains("automation"))
		{
			System.out.println("Message is displayed : Passed");
		}
		else
		{ System.out.println("message is not displayed : Failed");
		}

		
		//equals  
		String S1 = "Hello";
		String S2 = "Hellow";
		if(S1.equals(S2))
		{
			System.out.println("Same value");
		}
		else
		{
			System.out.println("Not matching values");
		}
		
		//substring
		String str1 = " Think out of the box" ;
		System.out.println(str1.substring(10));
		
		System.out.println(str1.substring(5, 20));
		
		String str2 = "Praseeda";
		String str3 = "Prasanth";
		
		System.out.println(str2+" " +str3);
		
		
		//split
		
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		
		String l[] = lang.split("_");
		
		System.out.println(l[0]);
		System.out.println(l[1]);
		System.out.println(l[2]);
		System.out.println(l[3]);
		
		//System.out.println(l[4]);
		
		//System.out.println(l.toString());
		
		// for loop
		
		for(int i=0; i<l.length;i++)
		{
			System.out.println(l[i]);
		}
		System.out.println(Arrays.toString(l));    //[JAVA, PYTHON, RUBY, JAVASCRIPT]
		
		String emp = "Laila;Rama;Pavan;Maya;Kiran";
		String list[]= emp.split(";");
		System.out.println(Arrays.toString(list));
		
		//for each loop
		for(String e:list)
		{
			System.out.println(e);
		}
		
		String xx = "You/need/to/practice/every/day/to/remember/java";
		
		String pract[] = xx.split("/");
		
		System.out.println(Arrays.toString(pract));
		
		for(String e : pract)
		{
			System.out.println(e);
		}
		
		String hel = "MehelloSeleniumhelloworldhello";
		
		String[] hell = hel.split("hello");
		System.out.println(Arrays.toString(hell));
		}

	}

