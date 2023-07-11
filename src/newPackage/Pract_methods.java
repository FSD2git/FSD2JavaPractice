package newPackage;
 public class Pract_methods {
	         //Global Variables

	 int x=40;    // Non-static   /Instance variable   
	static int y = 70;   // Static  /Class variable
	
	public static void test()
	{
		int y=100;
		System.out.println(Pract_methods.y);  //100
	}
	
	public void demo()
	{
		int x=20;
		
		System.out.println(this.x);//40
	}
	
	public static void main(String[] args) 
	{	
		
		
		Pract_methods obj = new Pract_methods();
		
		obj.demo();
	}
	
}
