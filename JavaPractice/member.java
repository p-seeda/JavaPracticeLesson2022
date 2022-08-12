
public class member {
	String name;
	int id;
	char active;

	public static void main(String[] args) {
		
member m = new member();
m.name = "Greg";
m.id = 101;
m.active = 'Y';

member m1 = new member();
m1.name = "Lisa";
m1.id = 102;
m1.active = 'N';

member m2 = new member();
m2.name = "Maya";
m2.id = 103;
m2.active = 'Y';

member m3 = new member();
m3.name = "Mike";
m3.id = 104;
m3.active = 'N';

System.out.println(m.name + " " + m.id + " " + m.active);
System.out.println(m1.name + " " + m1.id + " " + m1.active);
System.out.println(m2.name + " " + m2.id + " " + m2.active);
System.out.println(m3.name + " " + m3.id + " " + m3.active);

System.out.println("----------------------");

m=m1;
System.out.println(m.name + " " + m.id + " " + m.active);
System.out.println(m1.name + " " + m1.id + " " + m1.active);
System.out.println(m2.name + " " + m2.id + " " + m2.active);
System.out.println(m3.name + " " + m3.id + " " + m3.active);

System.out.println("----------------------");

m1=m2;
System.out.println(m.name + " " + m.id + " " + m.active);
System.out.println(m1.name + " " + m1.id + " " + m1.active);
System.out.println(m2.name + " " + m2.id + " " + m2.active);
System.out.println(m3.name + " " + m3.id + " " + m3.active);

System.out.println("----------------------");
m2=m3;
System.out.println(m.name + " " + m.id + " " + m.active);
System.out.println(m1.name + " " + m1.id + " " + m1.active);
System.out.println(m2.name + " " + m2.id + " " + m2.active);
System.out.println(m3.name + " " + m3.id + " " + m3.active);

System.out.println("----------------------");
m3=m;
System.out.println(m.name + " " + m.id + " " + m.active);
System.out.println(m1.name + " " + m1.id + " " + m1.active);
System.out.println(m2.name + " " + m2.id + " " + m2.active);
System.out.println(m3.name + " " + m3.id + " " + m3.active);

System.out.println("----------------------");


	}

}
