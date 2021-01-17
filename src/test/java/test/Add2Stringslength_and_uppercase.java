package test;

public class Add2Stringslength_and_uppercase {

	public static void main(String[] args) {
		String A= "hello World";
		String B="java";
		//int stra=A.length();
		//int strb=B.length();
		/*System.out.println(A.length()+B.length() );
		 String Auppercase= A.substring(0, 1).toUpperCase() + A.substring(1);
         String Buppercase= B.substring(0, 1).toUpperCase() + B.substring(1);
         System.out.println(Auppercase +" "+Buppercase);  */
         
         if(A.equalsIgnoreCase(new  StringBuilder(A).reverse().toString()))
         {
        	  System.out.println("Yes");
         }
              else{
            	  System.out.println("No");
              }
                 
         }
		
	}
         

	


