
public class ConditionalOperators {

	public static void main(String[] args) {
		//Something is true / False , Present or Not , Actual  vs Expected
		
		int i=10;
		int j=20;
		System.out.println(i==j);
		
		//Condition operator, condition should represent a boolean value
		// "==" comparison operator  eg: if(i==j)
		// "=" assignment  eg: i=10;
		// "if" is a condition
		 
		if(i==j)
		{
			System.out.println("i and j are equal");
		}
		else
		{
			System.out.println("i and j are not equal");
		}

		if(j>=i)
		{
			System.out.println("HELLO");
		} else {
			System.out.println("BYE");
		}
		
		if(i<=j){
			System.out.println("HELLO");
		} else {
			System.out.println("BYE");
		}
		
		if(true)
		{
			System.out.println("Hello Praseeda");
		}
		else
		{
			System.out.println("Bye Bye");  //Dead code
		}
	
	/* No dead code here because it dependent on the variable
	 * 
	 */
	boolean wink = true;
	if(wink) {
		System.out.println("Love you");
	} else
	{
		System.out.println("Hate you");
	}
	
	//Nested if
	int marks =90;
	if(marks<=100)
	{
		if(marks>=90)
		{
			System.out.println("A Grade");
		}
		if(marks<=80)
		{
			System.out.println("B Grade");
			if(marks<=50)
			{
				System.out.println("C Grade");
			}
		}
		else {
			System.out.println("Good Bye");
		}
		
//		else
//		{
//			System.out.println("wrong mark entered");
//		}
	}
	
	// Next example with String variable. When you compare string variable, you will not use the arithmetic operator "==", instead use ".equals"
	
//	String browser = "xie";
//	if(browser.equals("chrome"))
//	{
//		System.out.println("Launch chrome");
//	}
//		if((browser.equals("safari")))
//		{
//			System.out.println("Launch safari");
//		}
//	if(browser.equals("ie"))
//	{
//		System.out.println("Launch ie");
//	}
//	else
//	{
//		System.out.println("Please pass the correct browser");
//	}
	
	// Find the highest Number of all
	
	String m= "Jello";
	System.out.println(m);
	
	int x= 900, y= 90,z= 74,k= 74;
	
	if(x>y && x<y && x<z & x<k)
	{
		System.out.println(x + " x is the lowest number");
	} else if (y<z && y<k)
	{
		System.out.println(y + " y is the lowest  number");
	}
	else if (z<k)
	{
		System.out.println(z + " z is the lowest  number");
		
	}
	else
	{ System.out.println(k + " k is the lowest  number");
	}
	
	
	
	

}
}
