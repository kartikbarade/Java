package SelectionStatement;

import java.util.Scanner;

public class LeapYearUsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your year : ");
		int year;
		year = sc.nextInt();
		
		String result =(year % 4 == 0) ?(year % 100 != 0 ? "Leap Year" :(year % 400 == 0 ? "Leap Year" : "Not Leap Year")): "Not Leap Year";
		System.out.println(result);
		
		
		sc.close();

	}

}
 