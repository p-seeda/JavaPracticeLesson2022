
public class MathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(9/3);
		
		System.out.println(9/2);
		System.out.println(9.0/2);   //9.0 is a floating number
		System.out.println(9/2.0);  // one of the number is floating , so the resultant is also floating number
		
		System.out.println(9.0/2.0); // both are floating number, resultant is also floating number
		
		System.out.println(0/100);
	/*	System.out.println(100/0);  // Ans is infinite if a number is divide by 0. but Java will give you an arithmentic Exception    */
		
		System.out.println(9.0/0);  // floating number resultant is infinity
		
		System.out.println(9/0.0);  //infinity
		
		//imp point in interview >> any number divide with 0.0, you will get NaN is as resultant
		// System.out.println(0/0);  //AE
		
		System.out.println(0.0/0.0);  //NaN - Not a number
		
		System.out.println(0.0/0); //NaN
		
		System.out.println(0/0.0); //NaN
		
		System.out.println(9.0/0.0); //Infinity
		
		//Modulas operator
		
		System.out.println(9%2);
		
		System.out.println(10%2);
		
		System.out.println(55%3);
		System.out.println('a'/97);  //'a' is a char and we are doing arithmetic operation gives a numeric value
		
		System.out.println('a'-'b');
		
		System.out.println("hello"+ 12.00 +30+32.44+'a'+'b'+100);  //hello12.03032.44ab100
		
		System.out.println( "Good day" + (23+7) + 'a'+'b');   //Good day30ab
		
		System.out.println(89+43+'a'+'b');
		System.out.println(7+4+"me"+'a'+'b'+('a'+'b'));

		
	}

}
