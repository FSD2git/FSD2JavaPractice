package newPackage;

public class ClassC extends ClassA{
     
	
	
	
	public void getCredentials()   //getter method
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	public void setCredentials(String UN, String Pswd)    //setter method
	{
		username=UN;
		password=Pswd;
		
		System.out.println(username);
		System.out.println(password);
	}

}
