package SelectionStatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year");
		year = sc.nextInt();
		
		//year is divisible by 4 and not divisible by 100 OR fully divisible by 400
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This year is a leap year");
		}
		else {
			System.out.println("This year is Not a leap year");
		}
		
		
		sc.close();
		

	}

}
