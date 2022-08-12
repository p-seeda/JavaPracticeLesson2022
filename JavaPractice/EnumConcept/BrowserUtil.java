package EnumConcept;

public class BrowserUtil {

	public static void main(String[] args) {
// what type of data type to store the enum value. What ever the enum name is the data type for Enum value
		Browser browser = Browser.CHROME;
		Browser browser1 = Browser.EDGE;
		
		if(browser ==Browser.CHROME)
		{
			System.out.println("launch Chrome");
		}
		//call Environment
		Environment env = Environment.DEV;
		System.out.println(env.getEnvValue());
		//call Integer 
		Integer ints = Integer.INT5;
		System.out.println(ints.getIntvalue());
		
		// call constant
		System.out.println(Constant.LOGIN_PAGE_TITLE);
		
		// Call Interface
		
		System.out.println(InterfaceConstant.DEFAULT_TIME_OUT);
	}

}
