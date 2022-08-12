package HashMapConcept;

import java.util.HashMap;

public class HashMapRegForm {
	public static void RegForm(String username , String password,String city, String country, String pin)
	{
	System.out.println("User is filled the form with the informations : "  + username + ":" + password + ":" + city + ":" + country + ":" + pin);
	}
	
	public static String Userinfo(String role)
	{
HashMap<String, String> Custinfo = new HashMap<String, String>();
		
Custinfo.put("admin", "prasi@gmail.com : ppass123 : Leander : USA : 78442");
Custinfo.put("seller", "jina@gmail.com : jpass123 : Austin : USA : 45422");
Custinfo.put("partner", "dana@gmail.com : dpass123 : LA : USA : 98664");
Custinfo.put("vendor", "hranush@gmail.com : hpass123 : hollywood : USA : 98332");
Custinfo.put("customer","arthur@gmail.com : apass123 : Carolina : USA : 44632");
		return Custinfo.get(role);
	}
	public static void main(String[] args) {
		String cust = Userinfo("admin");
		System.out.println((cust));

		String creds[] = cust.split(":");
		String username = creds[0];
		String password = creds[1];
		String city = creds[2];
		String country = creds[3];
		String pin = creds[4];
		//RegForm(username,password,city, country, pin);
		
	
	}

	}


