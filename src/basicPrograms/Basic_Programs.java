package basicPrograms;

import java.util.Random;
import java.util.Scanner;


public class Basic_Programs {
	
	public void FibonnaciSeries() {
		
	}
	
	public void PrimeNumbers() {
		
	}

	public void PalindromeProgram() {
		
	}
	
	public void FactorialNumber() {
		
	}
	
	public void ArmstrongNumber() {
		
	}
	
	public void GenerateRandomNumber() {
		Random rc = new Random();
		
		System.out.println("Enter the number of digits you want to generate random number::");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String number="9";
		for(int i=1;i<a;i++) {
			number = number + 9;
			System.out.println(number);
		}
		
		int randomNumberDigits = Integer.valueOf(number);
		System.out.println("Random Number of "+a+" digit is :: "+rc.nextInt(randomNumberDigits));
		
	}
	
	public void CompareTwoObject() {
		
	}
	
	public void CreateObject() {
		
	}
	
	public void PrintAsciiValue() {
		
	}
	
	public void PrintPattern() {
		
	}
}
