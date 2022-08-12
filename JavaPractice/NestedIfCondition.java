
public class NestedIfCondition {

	public static void main(String[] args) {
		
		int mark = 95;
		if(mark>=95 && mark<=100)
		{
			System.out.println("Congratualtions, you got A+");
		}
		if(mark>=90 && mark<95)
		{
			System.out.println("You got Grade A");
		}
		else if(mark>=85 && mark<90)
		{
			System.out.println("Good job, you got B+");
		}
		else if(mark>80 && mark<85)
		{
			System.out.println("Your grade is B");
		}
		else if(mark>=70)
		{
			System.out.println("You are passed. Keep trying");
		}
		else
		{
			System.out.println("Your mark is "+ mark + ". Minimum grade to pass the test is 70 and above");
		}
	}

}
