package newPackage;

public class ClassB extends ClassA {
	 //a=100
	int a=200;
	static int b=120;
	public void xyz()
	{
		System.out.println(super.a);
		
	}  
	
	public static void main(String[] args) {
		
		ClassB obj2 = new ClassB();
		obj2.xyz();
		
		System.out.println(ClassA.b);
	}
		
}
