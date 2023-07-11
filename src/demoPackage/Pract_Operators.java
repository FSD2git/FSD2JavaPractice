package demoPackage;

public class Pract_Operators {
	public static void main(String[] args) {
	//Operators
	//1. Arithmetic Operators
	int a =10;  
	int b =5;
	

	//i. Addition (+)
	int c = a+b;
	System.out.println(c);
	 
	byte b1 = 40;
	byte b2 = 2;
	
	int b3 = b1+b2;  //42
	
	short s1 =30;
	short s2 = 40;
	
	int s3 = s1+s2;
	 //ii.Subtraction (-)
	 int d= a-b;
	System.out.println(d);
	
	//iii.Multiplication (*)
	 int e = a*b;
	 int f=a*20;
	 System.out.println(e);
	
	// iv. Division(/)
	 int g= a/3;   //10/3= 3
	 System.out.println(g);
	 System.out.println("------------------");
	 float i=10;   //10.00
	 float j=3;    //3.00
	 float k= i/j;  //3.333 
	 
	 System.out.println(k);
	 
	//v.Modulus(%)   
	 int m = a%3;   // 10%3;
	 System.out.println(m);
	 
	//vi.Incremental Operator (++) -- to increase the value by 1  
	 System.out.println(++a);   //pre-increment
	 // a++;                    //post-increment
	
	 int r=10;
	 //vii. Decrement Operator (--) -- to decrease the value by 1  
		 System.out.println(--r);   //pre-decrement
		 // a--;                    //post-decrement
		 
	// 2. Assignment operator (=)
		 //syntax   variable = value;
		 int t;  //Declaration ([Data type]  variable name; )
		 t=50;  // initialization 
		
		 t=70;
		 System.out.println(t);
		 
	//3. Relational operators (comparison operators)
		//i. Greater Than (>)
		 int x=30;
		 int y=70;
		 
		 boolean result = x>y;   //Y/N (true/false)
		System.out.println(result);
		
		//ii.Less Than (<)
		 boolean result2 = x<y;    //true
		 System.out.println(result2);
		 
		//iii.Equals (==)
		 boolean result3 = (x==y);
		 System.out.println(result3);
		 
		//iv. Greater than and Equal to (>=)
		boolean r2= x>=y;
		System.out.println(r2);
		System.out.println("======================");
		System.out.println(y>=x);
		
		//v. Less than and Equal to (<=)
		boolean r3 = x<=y;
		System.out.println(r3);
		
	
		//vi. Not Equal (!=)
		boolean r4 = x!=y;  //30 is not equal to 70--> true
		System.out.println(r4);
		System.out.println("======================");
		
		
		
		//4. Logical Operators :(Boolean)
		// i. AND (&&)
		 boolean result1 = (5>3) && (9<8);
		 		//F		//t   &&   f
		
		 System.out.println(result1);
		
		 //ii. OR (||)
		 boolean result12 = (5>3) || (9<8);
		 System.out.println(result12);
		
		 //iii. Not (!)
		
		 boolean result13 = !(5>3);
		 System.out.println(result13);
		
		
		
		
		
	}

}
