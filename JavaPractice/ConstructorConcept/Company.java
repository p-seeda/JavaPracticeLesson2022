package ConstructorConcept;

public class Company {

	String CompName;
	String HQ;
	String CEO;
	double turnover;
	
	
	
public Company(String compName) {
		CompName = compName;
	}

public Company(String compName, String hQ) {
	CompName = compName;
	HQ = hQ;
}

public Company(String compName, String hQ, String cEO) {
	CompName = compName;
	HQ = hQ;
	CEO = cEO;
}

public Company(String compName, double turnover) {
	CompName = compName;
	this.turnover = turnover;
}

public Company(String compName, String cEO, double turnover) {
	CompName = compName;
	CEO = cEO;
	this.turnover = turnover;
}

public Company(String compName, String hQ, String cEO, double turnover) {
	CompName = compName;
	HQ = hQ;
	CEO = cEO;
	this.turnover = turnover;
}

//public Company(String compName, String cEO) {
//	CompName = compName;
//	CEO = cEO;
//}
	

	
}
