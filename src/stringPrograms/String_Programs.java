package stringPrograms;

import java.util.Scanner;

public class String_Programs {
	
	public void Count_total_number_of_characters_in_string() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String s = sc.next();
		System.out.println(s);
		
		for(int i=0;i<=s.length()-1;i++) {
			System.out.println("character at "+i+" is ::"+s.charAt(i));
		}
		System.out.println("Total length of the string is ::"+s.length());
		
	}

}
