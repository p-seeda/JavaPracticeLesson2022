
public class MailApp {
	
	int price;
	static String website= "gmail.com" ;
	public void sendMail() {
		System.out.println("Send  email");
	}
	
	public static void sendInfo()
	{
		System.out.println("Send Info");
	}

	public static void main(String[] args) {
		//how to call non static method ? 
		// Create obj
		
		MailApp ma = new MailApp();
		ma.sendMail();
		
		//how to call static method?
		// 1. using Class name
		MailApp.sendInfo();
		
		//2.  call directly
		sendInfo();
		
		//3. call by object reference name
		
		ma.sendInfo();
		
		ma.price = 100;
		System.out.println(ma.price);
		
		System.out.println(website);
		System.out.println(MailApp.website);
	}

}
