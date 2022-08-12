package WebDriver_Arch;

public interface Webdriver extends SearchContext{
	@Override
	public void searchElement();
	
	@Override
	public void searchElements();
	
	 public void get(String url);
	 
	 public void click(String Element);
	 
	 public void SendKeys(String Element, String Values);
	 
	 public String getTitle();
	 
	 public void close();

}
