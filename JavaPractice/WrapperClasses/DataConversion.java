package WrapperClasses;

public class DataConversion {

	public static void main(String[] args) {

		String x= "100";
		System.out.println(x+20); //10020
		
		// Convert String to Integer
		int x1= Integer.parseInt(x);
		System.out.println(x1+20); // 120
		
		//String y = "100A";
		//int y1 = Integer.parseInt(y);
		//System.out.println(y1); // NumberFormatException
		//convert a string with incorrect format to numeric type
		
		//Convert String to double value
		
		String s = "23.44";
		System.out.println(s);
		double s1 = Double.parseDouble(s);
		System.out.println(s1+20);
		
		// Convert Integer to String
		//In Selenium , sendKeys() will help to enter the value in a particular text field
		//valueOf() -will give you the equivalent string value
		int tot = 1000;
		String t = String.valueOf(tot);
		System.out.println(tot + " is received");
		
		double db = 199.33;
		String db1 = String.valueOf(db);
		System.out.println("Your balance is : "  + db);
		
		//String to Boolean
		String b = "true";
		Boolean flag = Boolean.parseBoolean(b);
		System.out.println(b);
		if(flag)
		{
			System.out.println("Pass");
		}
		
		String headless = "true";
		if(Boolean.parseBoolean(headless))
		{
			System.out.println("launch chrome in headless");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		// Boolean to String
		//in selenium you cannot enter a boolean value in the framework. In that case you have to convert a boolean to string
		boolean f = true;
		String f1 = String.valueOf(f);
		System.out.println(f1+20);
		
		//quick data conversion
		
		// String to long;
		
		String pop = "77499347293455";
		Long l =Long.parseLong(pop);
		System.out.println(l+10000);
	}
	

}
