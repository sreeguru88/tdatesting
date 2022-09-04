package test.code.decode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindPalindromeIn_aString {
	
	public static String Free= "madam sree bob";
	public ArrayList<String> nonpalindrome= new ArrayList<String>();
	public ArrayList<String> palindrome= new ArrayList<String>();

	//ssssssss
	public List<String> checkifpalindrome(String str)
	{
		
		char[] ch=str.toCharArray();
		int i = 0, j = ch.length - 1;
		
		if(str.charAt(i)!=str.charAt(j))
		{
			nonpalindrome.add(str);
		}
		
		 palindrome.add(str);
		return palindrome;
		
	}

	public static void main(String[] args)
	{
		FindPalindromeIn_aString str= new FindPalindromeIn_aString();
		System.out.println(str.checkifpalindrome(Free));
		
	}
}
