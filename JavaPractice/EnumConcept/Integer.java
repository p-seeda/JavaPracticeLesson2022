package EnumConcept;

public enum Integer {
INT1(10),
INT2(20),
INT3(30),
INT4(40),
INT5(50);
	private int intNo;
	
	Integer(int intNo)
	{
		this.intNo = intNo;
	}
 
 public int getIntvalue()
 {
	 return this.intNo;
 }
}
