package newPackage;

public class Pract_Constructor {
	
	//1. Constructor is special member of class
	//2. It have same name as of the class name
	//3. It used to initialize the non static elements 
	 //  into the objects
	//4. It do not have any return type
	
	// There are two types of constructors
	// 1.Default constructor 
	// 2.User defined constructors
	     /* i. without argument constructor (zero argument)
	      * ii. with argument constructor
	      */
	  
	
	int t;
	int s;
	int x;
	
	public Pract_Constructor()
	{
		t=10;
		s=60;
		x=100;
	}
	
	public Pract_Constructor(int a)
	{
		t=30;
		s=90;
		x=200;
	}
	
	public Pract_Constructor(String a)
	{
		t=40;
		s=20;
		x=300;
	}
	
	public static void main(String[] args) {
		
		
	Pract_Constructor p = new Pract_Constructor();
	System.out.println(p.t);
	System.out.println(p.s);
	System.out.println(p.x);
	
	System.out.println("-----------------------");
	
	Pract_Constructor q = new Pract_Constructor(10);
	System.out.println(q.t);
	System.out.println(q.s);
	System.out.println(q.x);
	
	// new Pract_Constructor(); // Constructor calling
	
	}
	
	
	

}
