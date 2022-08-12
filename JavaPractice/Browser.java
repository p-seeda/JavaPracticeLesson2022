
public class Browser {
	
	// Launch Browser if the Browser is identified
	// Create a function name LaunchBrowser()
	// input parameter browserName(String)
	//return : Boolean (true / false)
	
	public boolean LaunchBrowser(String browserName)
	{
		boolean flag = false;
	 switch(browserName) {
	 case "Chrome":
	 System.out.println("Chrome is Launched");
	 flag = true;
		 
		 break;
	 case "Firefox":
		 System.out.println("FF is Launched");
		 flag = true;
			 
			 break;
	 case "Internet Explorer":
		 System.out.println("ie is Launched");
		 flag = true;
			 
			 break;
	 case "Safari":
		 System.out.println("Safari is Launched");
		 flag = true;
			 
			 break;
		 default:
			 System.out.println("Please pass the correct Browser name ....");
			 break;
			 
	 }
	  return flag;
		
	}

	public static void main(String[] args) {

		Browser br  = new Browser();
		boolean Browse = br.LaunchBrowser("Frrr");
		//System.out.println("Launch Browser " );
		System.out.println("https://google.com");

		
	}

}
