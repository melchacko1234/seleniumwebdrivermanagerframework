package test;

import java.util.Scanner;

public class Fibaonacci_series {

	public static void main(String[] args) {
		
		
		int num;
		
		Double s;
		 String res;
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num :");
		num=sc.nextInt();
		
		int f1,f2=0,f3=1;
		for (int i=1; i<=num; i++)
		System.out.println(f3 +" ");
		f1=f2;
		f2=f3;
		f3=f1+f2;
		

	}

}
