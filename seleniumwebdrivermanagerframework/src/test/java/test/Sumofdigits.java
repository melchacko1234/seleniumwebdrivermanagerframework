
package test;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int n;
		System.out.println("Enter the digits to sum the digits");
		n=in.nextInt();
		
		int sum=0;
		while(n !=0)
		{
			
			sum=sum + n %10;;  
			n=n/10;
			
			
			
		}
	System.out.println("the sum of digits is :" +sum);
    } 
}
