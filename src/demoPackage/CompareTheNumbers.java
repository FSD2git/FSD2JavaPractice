package demoPackage;

public class CompareTheNumbers {
	public static void main(String[] args) {
    //  ladder if - else
	 float marks =35.78f;
	 
	 if (marks>=85)
	 {
		System.out.println("Take admission to Science");
	 }
	 else if (marks >=65)
	 {
		System.out.println("Take admission to Commerce");
	 }
	 else if(marks>=35)
	 {
		System.out.println("Take admission to Arts");

	 }
	 else
	 {
		System.out.println("You are failed");
	 }
	
	 
	 /*
	  *   m>=85 -- sci
	  *   m>=65 -- com
	  *   m>=35 -- Arts
	  *   m<35  -- fail
	  */
	}
}
