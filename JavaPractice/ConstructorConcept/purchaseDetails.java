package ConstructorConcept;

import java.util.ArrayList;

public class purchaseDetails {

	public static void main(String[] args) {
		
		Purchaseapp pa1 = new Purchaseapp("Kia", "Manott", true);
		ArrayList<String> Oh = new ArrayList<>();
		Oh.add("Jigzo puzzle");
		Oh.add("ziplock");
		Oh.add("diary");
		
		Purchaseapp pa2 = new Purchaseapp("Lalo", 7372, "mayalalo@test.com", Oh);
		
		System.out.println(pa2.Fname +","+ pa2.Lname+"," + pa2.id + ","+ pa2.orderHistory);
		
		ArrayList<String> Oh2 = new ArrayList<>();
		Oh2.add("American Doll");
		Oh2.add("Drawn");
		Oh2.add("Doodle poodle");
		
		Purchaseapp pa3 = new Purchaseapp("Kanon", 3993, "kkannon@test.com", Oh2);
		
		System.out.println( pa3.Lname+"," + pa3.id + ","+ pa3.orderHistory);



	}

}
