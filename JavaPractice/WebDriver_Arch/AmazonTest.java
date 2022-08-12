package WebDriver_Arch;

public class AmazonTest {
	
	static Webdriver driver; 

	public static void main(String[] args) {
		
		//Apply concept of Topcasting
		
		String browser = "safari";
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FireFoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			System.out.println("Please pass the correct Url : You entered the url  " + browser );
		}
		//FireFoxDriver driver = new FireFoxDriver();
      
		//SafariDriver driver = new SafariDriver();

		//ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com");
	    driver.click("Sign in");
	    driver.SendKeys("Username" , "prpseeda");
	    driver.SendKeys("Password", "Password-123");
	    String title  = driver.getTitle();
	    if (title.equals("Amazon Shopping"))
	    {
	    	System.out.println("Title is correct");
	    } else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    
		driver.close();
		
	
	}

}
