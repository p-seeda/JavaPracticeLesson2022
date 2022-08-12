package StringManipulation;

import java.util.Arrays;

public class StManipulation {

	public static void main(String[] args) {

		String st = "hello this is my java code and i am very happy";
		
		System.out.println(st.length());
		
		int len = st.length();
		
		// find the character at the 8th position
		System.out.println(st.charAt(8));  // i
		System.out.println(st.charAt(41));
		
		//System.out.println(st.charAt(46)); // SIOB -StringIndexOutOfBoundsException
		
		// find the index of the value
		
		System.out.println(st.indexOf('m'));
		
		System.out.println(st.indexOf('m', st.indexOf('m')+1));
		
		System.out.println(st.indexOf('i'));
		System.out.println(st.indexOf('i', st.indexOf('i')+1));
	    System.out.println(st.indexOf('i', st.indexOf('i')+1+ st.indexOf('i')+1)); // find the 2nd index of the char'i'
	    System.out.println(st.indexOf('i', st.indexOf('i')+1+ st.indexOf('i')+1+1));  // find the 3rd position of index 'i'
//================================================================================================================================//	    
	 // find the index of a string
	    System.out.println(st.indexOf("very"));  
	    System.out.println(st.indexOf("happy"));
        System.out.println(st.indexOf("hllll"));   // If the specific string is not available, "-1" will be given as o/p
        
        // find the message is showing the "admin" value or not
        String msg = "Welcome Admin";
        
        if(msg.indexOf("Admin")!=-1)
        {
        	System.out.println("Admin is displayed on the message and test is passed");
        }
        else
        {
        	System.out.println("Admin is not displayed and test is failed");
        }
        
      //================================================================================================================================//	 
        
      //Print the first letter in the string to be uppercase
        
        String uc = "this is my first java code";
        System.out.println(uc.toUpperCase());
        String lw = "THIS IS MY FIRST JAVA CODE";
        System.out.println(lw.toLowerCase());		
        
      //Print the first letter in the string to be uppercase  :Substring


        String st1 = "hello this is my java code and i am very happy";
        String cap2 = st1.substring(0, 1).toUpperCase()+st1.substring(1);
        System.out.println(cap2);	 
        
        String uc2 = uc.substring(0, 1).toUpperCase()+uc.substring(1);
        System.out.println(uc2);
        
        //===============================================================================================================================//
        
        //trim
        String s= "    World wonders     ";
        System.out.println(s.trim());
        
        //==============================================================================================================================//
        
        //replace:
        String dob = "01-01-1990";
        System.out.println(dob.replace("-", "/"));
        
        
        String mil = "hello this is my java code and i am very happy";
        
        System.out.println(mil.replaceAll("java", "Selenium"));
        
      //==============================================================================================================================//
        
        //contains
        
        String m = "Your User id is E88422300";
        System.out.println(m.contains("E884223"));
        if(m.contains("E88422301"))
        {
        	System.out.println("User id is  displayed - PASSED");
        } else
        {
        	System.out.println("User id is  not displayed - FAILED") ;

        }
        
        //==========================================================================================================================//
        
        //equals
        //String literals
        String p = "hello selenium";
        String k = "hello Selenium";
        System.out.println(p.equals(k));
        System.out.println(p.equalsIgnoreCase(k));
        
        
        String h = new String("hello world");
        String g = new String("hello world");
        System.out.println(h==g);
        System.out.println(p==k);
        System.out.println(h.equals(g));
        //==========================================================================================================================//

//String is immutable in java
        
        // Substring
        
        String test = "your order id is  77434";
               
        System.out.println(test.indexOf("77434"));
        System.out.println(test.substring(18));
        
        System.out.println(test.substring(test.indexOf("77434"), test.length()));
        System.out.println(test.substring(test.indexOf("is")+4, test.length()));

//Split an imp String manupulation concept
	
	String lang = "Java_Python_Ruby_JavaScript";
	String[] a1= lang.split("_");
	//Print the string with index
	System.out.println(a1[3]);
	System.out.println(a1[1]);
	System.out.println(a1[2]);
	// Print arrays to string 
	System.out.println(Arrays.toString(a1));
	// Print with for each loop
	for(String e:a1)
	{
		System.out.println(e);
	}
System.out.println("-------------------------");
    //Print with for loop
for(int i=0; i<a1.length;i++)
{
	System.out.println(a1[i]);
}

// append

String h1 = "Hello";
String h2 = h1+"Praseeda";
System.out.println(h2);

StringBuffer l1 = new StringBuffer("Hello");
System.out.println(l1.append("Selenium"));

// StringBuffer & StringBuilder

StringBuffer me1 = new StringBuffer("I'm");
StringBuffer me2 = new StringBuffer(me1.append(" a good"));
System.out.println(me2.append(" Student"));



	}	
}
