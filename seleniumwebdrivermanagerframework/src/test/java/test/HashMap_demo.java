package test;

import java.util.HashMap;

public class HashMap_demo {

	public static void main(String[] args) {
	HashMap<String, Integer> people = new HashMap<String, Integer>();
	people.put("Ann Dominic", 31);
	people.put("Tisa Dominic", 27);
	people.put("Dominic paul", 63);
	people.put("Dominic paul", 21);
	people.put("Tisa Dominic", 27);
		
	for (String i: people.keySet())
	{
	System.out.println("Name : " + i +" Age is " + people.get(i)); 
	
	//for (String i :people.keySet()) // for getting key values
	//{
    //System.out.println(i);
	//}
	
	/* for (Integer i: people.values()){  // for getting  values
		
		System.out.println(i);*/
		
	
	
	}
	

}
}

