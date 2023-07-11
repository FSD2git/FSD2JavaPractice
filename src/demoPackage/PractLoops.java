package demoPackage;

import java.util.Scanner;

public class PractLoops {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row numbers :");
		int row= sc.nextInt();  // integer
		String s=sc.next();      // String
		boolean b= sc.nextBoolean();  //Boolean
				
		
		for (int i=1; i<=row; i++)     // no. of rows
		{  
			for(int j =row; j>i; j--)   // no. of stars
			{
				System.out.print(" ");	
			}
			
			for(int j =1; j<=(2*i -1); j++)   // no. of stars
			{
				System.out.print("*");	
			}	
			System.out.println();
		}
		
		
		
		 
		//   (2*i -1)
		// =================== Pattern============== //
		//  row  stars 
		/*   1     1             *
		 *   2     2            ***
		 *   3     3           *****
		 *   4     4          *******
		 *   5     5         *********
		 */
		
		
		
		//2000-3.2    <2  --- Loop //1. for
								   // while
		/*
		 *       while(condition)
		 *       {
		 *            // repeated code 
		 *       
		 *       }
		 */
		
	/*	int a = 21;
		while(a<=20)//false
		{
			System.out.println("Value from while " +a);
			a=a+2;  
		}
		
		
		// do-while
		do
		{
			a=a+2;
			System.out.println("Value from do-while " + a);
			
		}
		while (a<20);  */
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
