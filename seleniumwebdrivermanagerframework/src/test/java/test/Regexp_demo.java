package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp_demo {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("Mel",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("hello mel Sir");
		boolean matchfound=matcher.find();
		if(matchfound)
		{
			System.out.println("Match found");
			
		}
		else
		{
			System.out.println("Match not found");
			
		}
		
		
		

	}

}
