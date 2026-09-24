package ProgrammingTechniques;

import java.util.Scanner;

public class NumberEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter the number");
		no = sc.nextInt();
		
		if(no%2==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
		sc.close();

	}

}
