package demo;

import org.testng.annotations.Test;

@Test(groups={"Allclasstest"})
public class Testng_multigroups_demo {

	@Test(groups= {"sanity","smoke"})
	public void test1()
	{
		System.out.println("This is test1");
	}

	@Test(groups= {"sanity","regression"})
	public void test2()
	{
		System.out.println("This is test2");


	}

	@Test(groups= {"smoke"})
	public void test3()
	{
		System.out.println("This is test3");


	}
	@Test(groups={"windows.sanity"})
	public void test4()
	{
		System.out.println("This is test4");
	}
}
