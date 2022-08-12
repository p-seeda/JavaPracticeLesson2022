
public class ASCIIValuePrint {

	public static void main(String[] args) {
		
		String N = "Hello";
		
		char a1 = 'a';
		char a2 = 'b';
		
		int valuea1 = a1;
		int valuea2 = a2;
		System.out.println("ASCII value of a is " + valuea1);
		System.out.println("ASCII value of b is " + valuea2);
		System.out.println(a1+a2);

		/*ASCII Value of a-z : 97 - 122
		 * A-Z :- 65-90
		 * 0-9 :- 48-57
		 */
		
		char b1= '0';
		char b2 ='3';
		System.out.println(b1+b2);
		
		char c1 = 'M';
		char c2 = 'X';
		
System.out.println(c1+c2);

/* Find the ASCII value of a char
 * 
 */

System.out.println((int)c1);

System.out.println(c2-c1);
// If you want to concatnate 2 char's write
System.out.println(a1+""+a2);

System.out.println(N+a1+a2);

System.out.println((int)a1+(int)a2);

char char1 = 'a';
System.out.println((int)char1);
char char2 = 'b';
System.out.println((int)char2);
char charx = 'x';
System.out.println((int)charx);

System.out.println("++++++++++++++++++++++++++++++++++");

// Range of Primitive values

System.out.println(Byte.MAX_VALUE);
System.out.println(Byte.MIN_VALUE);

System.out.println(Short.MAX_VALUE);
System.out.println(Short.MIN_VALUE);

System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);

System.out.println(Long.MAX_VALUE);
System.out.println(Long.MIN_VALUE);

System.out.println(Float.MAX_VALUE);
System.out.println(Float.MIN_VALUE);
 
System.out.println(Double.MAX_VALUE);	
System.out.println(Double.MIN_VALUE);
	}
	


}
