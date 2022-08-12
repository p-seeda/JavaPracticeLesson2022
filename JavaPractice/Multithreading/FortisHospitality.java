package Multithreading;

public class FortisHospitality extends Medical implements USMedical,IndianMedical,UKMedical {

	@Override
	public void cardioService() {
		System.out.println("USMedical ........Providing Cardio Service ");
		
	}

	@Override
	public void NeuroService() {
		System.out.println("USMedical ........Providing Neuro Service ");

		
	}

	@Override
	public void physioService() {
		System.out.println("USMedical ........Providing Physio Service ");
		
	}

	@Override
	public void emergencyService() {
		System.out.println("USMedical ........Providing Emergency Services ");
		
	}

	@Override
	public void pediatricService() {
		System.out.println("Indian Medical ........Providing Pediatric Services ");
		
	}

	@Override
	public void oncologyService() {
		System.out.println("Indian Medical ........Providing Oncology Services ");

	}

	@Override
	public void dentalService() {
		System.out.println("UK Medical ........Providing dental Services ");
		
	}

	@Override
	public void entService() {
		System.out.println("UK Medical ........Providing ENT Services ");
		
	}
	
	public void medicalInsurance() {
		System.out.println("Fortis Hospital .....Medical Insurance");
	}
	
	public void medicalTraining() {
		System.out.println("Fortis Hospital .....Medical Training");
	}

	@Override
	public void CovidVacc() {
System.out.println("WHO ..... Covid vaccination");		
	}

	@Override
	public void EmergencyServices() {
System.out.println("FH ---Emergency Services");		
	}
	
	


}
