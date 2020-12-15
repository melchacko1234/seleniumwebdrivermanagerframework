package test;

import java.util.Scanner;

public class Sum_of_n_numbers {

	public static void main(String[] args) {
		
		int n;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'n':");
		n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
			temp=temp+i;
		System.out.println(" The sum upto " +n + "is :" +temp);
		
	}
   
}
