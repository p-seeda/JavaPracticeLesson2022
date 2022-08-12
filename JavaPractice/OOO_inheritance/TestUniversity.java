package OOO_inheritance;

public class TestUniversity {

	public static void main(String[] args) {
		
		IITDelhi id = new IITDelhi();
		
		id.pg();
		id.ElectricalEng();
		id.CivilEng();
		id.Research();
		id.mTech();
		id.phd();		
		System.out.println("============================");
		
		
		AnnaUniversity au = new AnnaUniversity();
		au.pg();
		au.phd();
		au.Research();
		au.Chemistry();
		au.Geo();
		au.mTech();
		System.out.println("============================");
		
		
		
		IIScBnglr ib = new IIScBnglr();
		ib.pg();
		ib.phd();
		ib.MechSc();
		ib.ComputerSc();
		ib.BiologicalSc();
		System.out.println("============================");
		
		
		
		TechUniversity tu = new TechUniversity();
		tu.pg();
		tu.phd();
		tu.Research();
		tu.mTech();
		
		System.out.println("============================");
		University u = new University();
		u.pg();
		u.Research();
	
				
System.out.println("============================");

//Topcasting

TechUniversity tech = new IIScBnglr();
tech.mTech();
tech.pg();
tech.Research();

	}

}
