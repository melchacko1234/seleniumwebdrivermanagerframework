package listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class Listenerdemo2 {
	
	@Test
	public void test4()
	{
		System.out.println("This is Test 4");
	}

	@Test
	public void test5()
	{
		System.out.println("This is Test 5");
	
	}
	@Test
	public void test6()
	{
		System.out.println("This is Test 6");
		throw new SkipException("Test 6 is skipped");
	}
}
