package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_paramaters {
	
	@Test
	@Parameters({"Myname"})
	public void test1(@Optional("Ann Dominic")String name)
	{
	System.out.println("The name is :"+name);	
	}

}
