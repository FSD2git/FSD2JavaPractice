package newPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassD  {
	public static void main(String[] args) {
		int a,b;
		a=20;
		int c=0;
		System.out.println("Enter the value of b:");
		Scanner sc = new Scanner(System.in);
		b=sc.nextInt();
		
		int p[] = {4,5,6,7,8,9};
		
		
		ClassA temp = new ClassA();
		try 
		{
			
			System.out.println(p[6]);  //ArrayIndexOutOfBoundsException
			 c=a/b;  //c=infinity/ArithmeticException
		}
		catch(ArithmeticException r)
		{
			System.out.println("Please enter Non 0 value");
			b=1;   
			c=a/b;  //20/1=20
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Please enter the index value less than given array size");
//			
//		}
//		catch(IndexOutOfBoundsException t)
//		{
//			System.out.println("Please enter correct index");
//			b=1;   
//			c=a/b;  //20/1=20
//		}
//		
//		catch(Exception e)
//		{
//		  System.out.println("code have generated exception");
//		  e.printStackTrace();
//		  e.getMessage();
//		  e.toString();
//		}
		
		finally
		{
			temp = null;
			System.out.println("This is the end of your program");
		}
	}
	
	//Try-Catch
		
}
