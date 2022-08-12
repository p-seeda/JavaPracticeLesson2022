package Multithreading;

public class Medical implements UaeMedical {
	
	public void MedicalResearch()
	{
		System.out.println("Medical ---- Medical Reasearch");
	}
	
	public void CancerCentar()
	{
		System.out.println("Medical----- Cancer Center");
	}

	@Override
	public void GynoSpeciality() {
System.out.println("UAE Medical ------ provides Gynocology Speciality");		
	}

	@Override
	public void Psychiatric() {
		System.out.println("UAE Medical ------ provides Psychiatric Speciality");		
		
	}
	

}
