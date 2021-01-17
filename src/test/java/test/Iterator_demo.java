package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(4);
		numbers.add(1);
		numbers.add(11);
		numbers.add(13);
		numbers.add(12);
		
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext())
		{
			Integer i= it.next();
			
			
			System.out.println(numbers);
		}
			}
		
	
	
	

	}


