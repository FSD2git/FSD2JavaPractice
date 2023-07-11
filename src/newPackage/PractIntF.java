package newPackage;

public interface PractIntF {
	
	int a=10;     // public, static, final  
	
	void demo();   //public & abstract
	
	void test();
	
	
	public static void add()
	{
		System.out.println("Add method of IF");
	}
	
    public default void xyz()
    {  //1.8
    	System.out.println("Default method of Interface");
    }
}
