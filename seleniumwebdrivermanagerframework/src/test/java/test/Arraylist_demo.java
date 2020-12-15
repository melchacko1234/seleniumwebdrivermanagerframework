package test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;

import org.bson.codecs.CollectibleCodec;

public class Arraylist_demo {

	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("BENZ");
		cars.add("TATA");
		//cars.add("Volvo");
		Collections.sort(cars);
		
		/*for (int i=0; i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}*/
		for(String i:cars)
		{
			System.out.println(i);
		}
LinkedList<Integer> number= new LinkedList<Integer>();
	}

}
