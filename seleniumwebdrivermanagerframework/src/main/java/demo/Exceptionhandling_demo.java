package demo;

public class Exceptionhandling_demo {

	
	public static void main(String[] args) {
		try
		{
			System.out.println("Hi Sam");
			int i=1/0;
			System.out.println("Completed");
			
		}
		catch(Exception exp)
		
		{
			System.out.println("I am inside catch");
			System.out.println("message is " + exp.getMessage());
			System.out.println("Cause is " + exp.getCause());
			exp.printStackTrace();
		}
	}
}
