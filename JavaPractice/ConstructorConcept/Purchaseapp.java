package ConstructorConcept;

import java.util.ArrayList;

public class Purchaseapp {
	
	String Fname;
	String Lname;
	int id;
	String email;
	Boolean isActive;
	ArrayList<String> orderHistory;
	public Purchaseapp(String fname, String lname, Boolean isActive) {
		Fname = fname;
		Lname = lname;
		this.isActive = isActive;
	}
	public Purchaseapp(String fname, String lname, String email, ArrayList<String> orderHistory) {
		Fname = fname;
		Lname = lname;
		this.email = email;
		this.orderHistory = orderHistory;
	}
	public Purchaseapp(String lname, int id, String email, ArrayList<String> orderHistory) {
		super();
		Lname = lname;
		this.id = id;
		this.email = email;
		this.orderHistory = orderHistory;
	}
	
	


	
	

}
