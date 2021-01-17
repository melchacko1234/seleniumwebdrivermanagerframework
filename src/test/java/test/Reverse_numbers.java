package test;

import java.util.Scanner;

public class Reverse_numbers {

	public static void main(String[] args) {
		
		
		int num;
		int result=0;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		num=in.nextInt();
		
		while(num>0)
		{
			result=result *10+num %10;
			num=num/10;
			
		
		}
		System.out.println("The reversed number is : " +result);
	}

}
