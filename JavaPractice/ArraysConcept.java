import java.util.Arrays;
import java.util.List;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//int i[]  = new int[4];  OR
		
		// you can write as int[] i = new [4] i;
		
		
		/* Find Lowest index of the array, highest index of the array and the length of the array
		lowest index of the array is always "0"   Lowest index =0
		highest index of the array = length of the array-1
	    length of the array = highest index +1   */
		
		int[] i = new int[4]  ;
		int li= 0;
		int hi = 3;
		int len = i.length;
		
		System.out.println("lowest index of the array is " + li);
		System.out.println("Highest index of the array is " + (len-1));
		System.out.println("Lenth of the array is " + len);
		
		i[0]=70;
		i[1]= 30;
		i[2]= 50;
		i[3]= 60;
		//i[4] = 89;  // Error message :  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		             //at ArraysConcept.main(ArraysConcept.java:29)

		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);  // Error message displayed AIOB - Array Index Outof Bounds Exception
		
		
		int k[] = new int[3];
		System.out.println(k[2]);  // Prints "0"  // Default value of int is "0"
		

		
		// PRint all the values from the array
		
		int marks[] = new int[5];
		marks[0] = 200;
		marks[1] = 300;
		marks[2] = 400;
		marks[3] = 500;
		marks[4] = 600;
		System.out.println("=========================");
		System.out.println(marks);  // Print some memory address : [I@1eb44e46
		
		System.out.println("=========================");
		for(int j=0 ; j<marks.length; j++)
			// or for(int j=0 ; j<=marks.length-1; j++)
		{
			System.out.println(marks[j]);
		}
		//Arrays.toString() -  is a built-in method of Arrays utility class and it provides the simplest way to turn an Array into a String.
		System.out.println(Arrays.toString(marks));
		// Arrays is a class 
		
		
		int[]no = {534,574,443,643};
		
		System.out.println(Arrays.toString(no));
		
		// String.join() - Join belongs to String class and it can be used to join string array to produce one single String instance
		
		String[] data = {"Turn","Array", "Into", "String","In", "Java", "Example"};
        String joinedstr = String.join(" ", data);
        System.out.println(joinedstr);
        CharSequence[] vowels  = {"a", "e", "i", "o", "u"};
        String joinedvowels = String.join(",", vowels);
        System.out.println(joinedvowels);
        List<String> strList = Arrays.asList("dev", "with", "us", "blog");
        String joinedString = String.join(", ", strList);
        System.out.println(joinedString);

        //IF you want to iterate each value in the array,  use "for loop". If you want to print directly without for loop,use arrays.toString(variable)
        //use the Arrays.toString(variable)
        
        String[] words = {"Java","is","my","favorite","Programming","Language"};
        System.out.println(Arrays.toString(words));
        String joined = String.join(" ", words);
        System.out.println(joined);
        
        // you can store int value in double array, but you cannot store double in int array
        
        // Finding the length of the arrays
        double[] miles = {43.5, 44.3, 77.4, 11.4, 66.7};
        System.out.println(miles.length);   // 5
        System.out.println(miles.length-1);  //4
        
        String[] data1 = {"Turn","Array", "Into", "String", "Java", "Example"};
        System.out.println(data1.length);  //7
        
        for(int n=0;n<data1.length; n++)
        {
        	System.out.println(data1[n]);
        }
        
        System.out.println("==============");
        
        System.out.println(data1[5]); // example
       System.out.println("================================================");
        
       for(int l=0;l<data1.length; l++)
      {
      	if(data1[l].equals("String"))
      	{
       		System.out.println("Find your 'String' ");
       		break;
       	}
      	System.out.println(data1[l]);
      }
        
        
        String emp[] = new String[5];
        emp[0] = "Sita";
        emp[1] = "Prasi";
        emp[2] = "Praseeda";
        emp[3] = "Seeda";
        emp[4] = "Prasu";
        
        for(int x=0; x<emp.length;x++)
        {
        	if(emp[x].equals("Praseeda"))
        	{
        		System.out.println("Hellooooooooooo");
        	}
        	System.out.println(emp[x]);
        }
        
        System.out.println("================================================");
        // Major problem with the array - 2 limitation
        //1. size is fixed - known as static array  : to overcome  this problem, we use dynamic array (ArrayList)
        //2. you can story only similar kind of data : to overcome  this problem, we use Object Array(static)
        
        //Object array:
       // If we need to store Employee information
        
        Object datas[] = new Object[5];
        datas[0] ="Micha" ;
        datas[1] =25 ;
        datas[2] =45.66 ;
        datas[3] = 'm';
        datas[4] =true ;
        
        System.out.println(Arrays.toString(datas));
        
        for(int z=0;z<=datas.length-1;z++)
        {
        	System.out.println(data[z]);
        }
        
        
        
        // Array Literals
        int m1[] = {4,34,6,7,34,7,8,41};
        System.out.println(m1[0]); //4
        System.out.println(m1.length);  //8
        //System.out.println(m1[m1.length]);  // -IOB
      System.out.println(m1[m1.length-1]);  //41
	}
	
	

}
