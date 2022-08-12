package OOP_Encapsulation;

public class Login {
private String userName;
private String password;

// generate getters and setters

public void getUserName() {
	if (userName == null)
	{
		System.out.println("You entered a null value. Please enter a valid Username");
	}
//	else if(userName .isBlank())
//	{
//		System.out.println("You entered a blank value. Please enter a valid Username");
//
//	}
//	else if(userName.isEmpty())
//	{		System.out.println("You entered an empty value. Please enter a valid Username");
//
//	}
	return userName;
}
public String setUserName(String userName) {
	return this.userName = userName;
}
public String getPassword() {
	if (password == null)
	{
		System.out.println("You entered a null value. Please enter a valid password");
	}
	else if(password .isBlank())
	{
		System.out.println("You entered a blank value. Please enter a valid password");

	}
	else if(password.isEmpty())
	{		System.out.println("You entered an empty value. Please enter a valid password");

	}
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
