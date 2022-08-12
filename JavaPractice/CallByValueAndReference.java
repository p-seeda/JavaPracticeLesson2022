
public class CallByValueAndReference {
	
	String name;
	int age;
	
public void add(int a, int b)
{
	int z = a+b;
	System.out.println("Sum of a and b is =" + z);
}

public void getInfo(CallByValueAndReference t)
{
	System.out.println(t.name + " " + t.age);

t.age = 18;
t.name = "Lovely";
System.out.println(t.name + " " + t.age);
}


	public static void main(String[] args) {
		//Call by value
CallByValueAndReference C = new CallByValueAndReference();
C.add(30, 54); // Call by value

C.add(88, 45);

C.add(53, 10);

C.name = "Elon Musk";
C.age =54;
C.getInfo(C);

System.out.println(C.name + " " + C.age);
	}

}
