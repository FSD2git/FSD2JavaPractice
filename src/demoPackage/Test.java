package demoPackage;

public class Test {
	
	public static void main(String[] args) {
		
		//Implicit
		int a = 10;
		float b = a;  //Widening casting
		
		float r=1000.30f;
		
		double amount=2000;
		
		//System.out.println(b);
		
		//Explicit casting   //Narrowing casting
		int e =384;    
		byte f=(byte)e;   //-128 to 127  -128 -127 -126 ....0, 1,2... 127
		                  //        127   128  129  130   ..........             
		
		System.out.println(f);
			
//			float p =20.40f;
//			int q=(int)p;
//			
//			System.out.println(q);
//			
			
			
		
	}

}
