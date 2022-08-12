package HashMapConcept;

import java.util.HashMap;

public class LoginPage {
	public static void doLogin(String username , String password)
	{
	System.out.println("User is logged in with : "  + username + ":" + password);
	}
	
	public static String getUserCredentials(String role)
	{
HashMap<String,String> credMap = new HashMap<String, String>();
		
		credMap.put("admin", "admin@amazon.com : admin123");
		credMap.put("seller", "seller@amazon.com : seller123");
		credMap.put("partner", "partner@amazon.com : partner123");
		credMap.put("vendor", "vendor@amazon.com : vendor123");
		credMap.put("customer", "prpseeda@amazon.com : pseeda123");
		return credMap.get(role);
	}

	public static void main(String[] args) {
		
		String cred = getUserCredentials("customer");
		System.out.println((cred));

		String creds[] = cred.split(":");
		String username = creds[0];
		String password = creds[1];
doLogin(username,password);
	}

}
