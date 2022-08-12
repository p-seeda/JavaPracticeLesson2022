package WebDriver_Arch;

public class SafariDriver implements Webdriver{
	
	public SafariDriver()
	{
		System.out.println("Safari Driver is Launched --------");
	}
	
	@Override
	public void searchElement() {
		System.out.println("Find the Element : ");
		
	}

	@Override
	public void searchElements() {
		System.out.println("Find the Elements : ");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Get the url : " + url);
		
	}

	@Override
	public void click(String Element) {
System.out.println("Click on  the Element :  " + Element);		
	}

	@Override
	public void SendKeys(String Element, String Values) {
		System.out.println("Send the credentials  : " + Element + " : " + Values);
		
	}

	@Override
	public String getTitle() {
String Title = "Amazon Shopping";
return Title;
	}

	@Override
	public void close() {
System.out.println("Close the browser");		
	}

}
