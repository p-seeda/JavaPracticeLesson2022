package ConstructorConcept;

public class ServingArea {

	public static void main(String[] args) {

		Company comp = new Company("Cognizant", null);
		System.out.println(comp.CompName);
		
		Company comp1 = new Company("TASB", "Austin", 1592.33);
		System.out.println(comp1.CompName + "," + comp1.HQ + " , " + comp1.turnover);
		
		Company comp2 = new Company("FICO", "Austin", "Alexandar", 34412.44);
		System.out.println(comp2.CompName + "," + comp2.HQ + " , " + comp2.turnover + ","+ comp2.CEO);
		
		Company com3 = new Company("88439");
		System.out.println(com3.CompName);

	}

}
