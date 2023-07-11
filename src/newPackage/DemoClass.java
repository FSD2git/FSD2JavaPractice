package newPackage;

public class DemoClass {
	
	public static void main(String[] args) {

		String s1 = "BSFSD";
		String s2 = "BSFSD";
		
		String t1 = new String ("BSFSD");
		String t2 = new String ("BSFSD");
		
		//1. equal equal(==)
		System.out.println(s1==s2);//true
		System.out.println(t1==t2); //false
		System.out.println(s1==t1); //false
	
		System.out.println("=======================");	
		//2.equals
		System.out.println(s1.equals(s2));  //true
		System.out.println(t1.equals(t2));  //true
		System.out.println(s1.equals(t2));  //true

		System.out.println("=======================");	
       
		//3.equalsIgnoreCase
		String a = "BSFSD";
		String b = "Bsfsd";
		System.out.println(a==b);
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println("=======================");	
	    //4.trim()
		String a1 = "BSFSD";
		String b1 = " Bsfsd ";
		
		System.out.println(b1);
		String b2 = b1.trim();
		System.out.println(b1.trim());
		System.out.println(b2);
		
		System.out.println(a1.equalsIgnoreCase(b2));
		
		//5.toUpperCase()
		System.out.println("=======================");	
		String x = "Bsfsd";
         System.out.println( x.toUpperCase());  //BSFSD
		
         //6.toLowerCase()         
        String a2 = a1.toLowerCase();
        System.out.println(a2);
        
        //7.length()
      int n= x.length();
      System.out.println(n);
      System.out.println(b1.length());
	
      System.out.println("=======================");	
  
      //8.toCharArray
      char ch []= x.toCharArray();
      //System.out.println(ch);
     for (int i = 0; i <x.length(); i++)
    {
      	  System.out.println(ch[i]);
    	 
	}
     System.out.println("=======================");	

    //9.charAt(index) 
     char c =x.charAt(2);
     System.out.println(c);
     
     for (int i = 0; i < x.length(); i++) {
		
    	 System.out.print(x.charAt(i));
	}
    System.out.println();
     String x2 = "Bsfsd";
     
     for (int i = (x.length()-1); i >=0 ; i--) {
 		
    	 System.out.print(x.charAt(i));
	}
   System.out.println(); 
   
    //10.concat()
     int y=10;
     String q=" which is the integer";
     System.out.println("This is the number: "+ y+ q);
     
     
     String str = "Student Name";
     System.out.println(str+ " Shubham");
     String newStr=str+ " Shubham";
     System.out.println(newStr);
     
    String st =str.concat(" Rohit");
    String st2 ="Rohit "+ str;
    System.out.println(st);
    
    //11.indexOf()
     String m="This is the number: 10 which is the integer";
     int indx =m.indexOf('w');
     System.out.println(indx);
     int newindx=m.indexOf('t');  //
     
	System.out.println(newindx);
	
	//12.lastIndexOf()
    int lastindx=m.lastIndexOf('t');  //
    System.out.println(lastindx);
    
    int lid=m.lastIndexOf("the"); 
    System.out.println(lid);
   
    System.out.println("======================="); 
   
   //13.startWith()
   boolean result= m.startsWith("This is");
   System.out.println(result);
   
   //14.endsWith()
    boolean result2=m.endsWith("integer");
    System.out.println(result2);
    
    
    //15.subString(i,j)/subString(i)
    String t="Student Name : Ram Patil";
    
   System.out.println(t.indexOf('R'));
   System.out.println(t.length());
   
   String tNew= t.substring(0,14);
   System.out.println(tNew);
   
   //16.replace()
   
   String t5=t.replace("Ram", "Sham");
   System.out.println(t5);
   
   String t6=t.replace('e', 'z');
   
   System.out.println(t6);
   
   String t7 = t.replaceFirst("e", "z");
   System.out.println(t7);
   
   String t8 = t.replaceAll("e", "z");
   System.out.println(t8);
   
   //regex- regular expression[a-z][A-Z][0-9][&#$@]
   
   String z="Ram Patil 12345";
   
  String z1 = z.replaceAll("[0-9]", "");
  System.out.println(z1);
   
	}
}
