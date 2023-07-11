package newPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public  class ClassA {

      int a =100;
      static int b=90;
      
      int c[]= {1,2,1,3,4,5,6};  
      
      
      public void printA() throws InterruptedException
      {
        System.out.println(a);
        Thread.sleep(3000);
      }
      
      
      public static void main(String[] args) throws InterruptedException, FileNotFoundException  {
    	
    	  ClassA obj = new ClassA();
    	  obj.printA();
    	  
    	  //List
    	  ArrayList<Integer> Al= new ArrayList<Integer>(); //DC=10
	    	  Al.add(10); //0
	    	  //Al.add(15) //1
	    	  Al.add(20); //2
	    	  Al.add(30); //3
	    	  Al.add(40); //4
	    	  Al.add(50); //5
	    	 
	    	char p;  
	    	  
	    	  //Al.add(1, 15);
    	  
    	  System.out.println(Al);
    	  
    	  LinkedList ll = new LinkedList();
    	  ll.add(10); //0
    	  ll.addAll(Al); //1
    	  ll.add(30); //3
    	  ll.add(40); //4
    	  ll.add(20); //5
    		
    	//  ll.add(1, 15);
    	  System.out.println("Linked List : "+ ll);
    	  System.out.println(ll.get(1));
    	  
    	  
    	  System.out.println(Al.get(3));
    	  //Set
    	  HashSet hs= new HashSet();
    	  hs.add(10); 
    	  hs.add(20); 
    	  hs.add(30); 
    	  hs.add(40); 
    	  hs.add(20); 
    	  
    	  System.out.println(hs);
    	  
    	  
    	  LinkedHashSet lhs = new LinkedHashSet<>();
    	  lhs.add(10); 
    	  lhs.add(30); 
    	  lhs.add(20); 
    	  lhs.add(40); 
    	  lhs.add(20); 
    	  
    	  System.out.println("LinkedHashSet : "+lhs);
       
    	  
    	  
       ArrayList al2 = new ArrayList();
       al2.addAll(hs);
      
       System.out.println(al2);
       System.out.println(al2.get(1));
       
       
       ArrayList al3 = new ArrayList(hs);
       System.out.println(al3);
       System.out.println(al2.get(1));
       
       // Sorted 
       TreeSet ts = new TreeSet();
       ts.add("Ram"); 
       ts.add("Sham"); 
       ts.add("Amar"); 
       ts.add(111); 
       
       
       System.out.println("TreeSet: "+ ts);
       
       HashMap  hm = new HashMap<String, String>();
        
        hm.put("Student Name", "Ram");
        hm.put("Roll No.", 1111);
        hm.put("Roll No.", 1122);
        hm.put("Std", "5th");
        hm.put("Fees Paid", null);
        hm.put(null, "XYZ");
        hm.put(null, 'r');
        hm.put("Div","5th");
        System.out.println(hm);
        
       System.out.println(hm.get("Student Name"));
        
       
       Hashtable ht = new Hashtable();
       ht.put("Student Name", "Ram");
       ht.put("Roll No.", 1111);
       ht.put("Std", "5th");
    //   ht.put("Fees Paid", null);
       System.out.println(ht);
       
       Thread.sleep(20000);
       
       FileInputStream file = new FileInputStream("C// user//test.txt");
       
       
      }
	
  
	
}
