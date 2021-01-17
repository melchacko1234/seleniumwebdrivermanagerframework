package test;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner in= new Scanner(System.in);
		int n;
		System.out.println("Enter the number to find the factorial ");
		n=in.nextInt();

		int result=1;

		while(n>0)
		{
			result=result*n;
			n --;
		}
		System.out.println("The factoril of the niumber is :" +result);
	}

}
