package demoPackage;

public class Array_Pract {
	
	//Array   
	//1. Array is the data structure (it can store multiple data)
	//2. Array is homogeneous in nature
	//3. Array is not growable in Nature
	
	// Syntax  
	// 1. Declaration and Initialization at time
	
	// DataType VariableName [] = {element1, element2, element3,...... };
	// DataType [] VariableName  = {element1, element2, element3,...... };
	
	// 2. Declaration and Initialization separately
	//   dataType variableName [] = new dataType[size];
	// 
	 static int p;
	 static String q;
	 //Default values
	 /*
	  * byte =0;
	  * short =0;
	  * int  =0;
	  * long = 0;
	  * float =0.0
	  * double = 0.0;
	  * boolean = false;
	  * char = null;
	  * String =null;
	  * 
	  */
	public static void main(String[] args) {
//		int[] a= {1,2,3,4,5,6,7,8,9,10};   // indexing starts from 0(zero)
//	    String name[] = {"Ram", "Sham", "Kiran"};
//	    boolean logic[] = {true, false, true, false};
//	    
//	    System.out.println(a[2]);  //Fetching the specific element
//	    
//	    //a[2]=10;                     // ArrayName[index]=Updated Value;
//	    
//	    System.out.println(a[2]); 
//	    
//	    System.out.println(a[4]);
//	    
//	    //a[5] =6;
//	    //System.out.println(a[5]);
//	    
//	   System.out.println(q);
//	    
//	    System.out.println("Value of p: "+p);
//	    
//	    int r[]=new int[5];  // Empty array - declaration;
//	    System.out.println(r[0]);
//	    r[0]=10;  //initialization
//	    r[1]=r[0]+10;
//	    r[2]=r[1]+10;
//	    
//	    System.out.println(r[0]);
//	  
//	    //for loop
//	  int size =a.length;   //10
//	  System.out.println("Size of the array: "+ size);
//	 
//	  
//	  // Last index = size -1;
//	                  //10
//	  for (int i=0; i<a.length;i++)
//	    {
//	      System.out.println(a[i]);
//	    }
		
		
		//multiple dimensional array
		//2D
		int a[][]= {{10,20,30,40},{50,60,70,80}, {90,100,110,120}};
		
		//System.out.println(a[0][3]);
		//System.out.println(a[2][2]);
	
		int size =a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			System.out.println(a[i][j]);
		}
//		
//		
//		int r[][]=new int[3][4];
//		r[0][0]=10;
//		System.out.println(r[0][0]);
	}
	
	
	
	

}
