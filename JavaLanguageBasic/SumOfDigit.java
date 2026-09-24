package JavaLanguageBasic;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		number = sc.nextInt();
		
		for(int i=1;i<=number;) {
			sum = sum + number %10;
			number = number/10;
		} 
		System.out.println("The Sum of Digit is "+sum);
		sc.close();

	}
 
}
