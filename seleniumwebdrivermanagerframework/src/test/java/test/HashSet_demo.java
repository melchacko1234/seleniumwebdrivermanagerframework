package test;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args) {
		HashSet<Integer> number=new HashSet<Integer>();
		
		
		/*cars.add("Volvo");
		cars.add("TATA");
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("BENZ");
		cars.add("Hyundia");
		cars.remove("BMW");
		System.out.println(cars.contains("EXL")); */
		
		number.add(5);
		number.add(6);
		number.add(8);
		number.add(10);
		
		for (int i=1;i<=10;i++)
		{
			if(number.contains(i))
			{
				System.out.println(i +" number is found in the set");
			}
				else
				{
				System.out.println(i +" number is not found in the set");
				}
			}
		}

	
	}


