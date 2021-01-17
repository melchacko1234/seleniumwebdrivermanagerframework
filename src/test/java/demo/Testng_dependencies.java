package demo;

import org.testng.annotations.Test;



public class Testng_dependencies {
	@Test(dependsOnGroups ={"sanity123"} )
	public void test1()
	{
		System.out.println("i am inside test1");
	}
	@Test(groups= "sanity123", dependsOnMethods={"test3", "test4"})
	public void test2()
	{
		System.out.println("i am inside test2");
	}
	@Test
	public void test3()
	{
		System.out.println("i am inside test3");
	}
	@Test
	public void test4()
	{
		System.out.println("i am inside test4");
	}

}
