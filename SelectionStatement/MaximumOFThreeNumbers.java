package SelectionStatement;

import java.util.Scanner;

public class MaximumOFThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		System.out.print("Enter the 1st number : ");
		n1 = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		n2 = sc.nextInt();
		System.out.print("Enter the 3rd number : ");
		n3 = sc.nextInt(); 
		
		if(n1>n2 && n1>n3) {
			System.out.println("The number one is greater");
		}
		else if(n2>n3) {
			System.out.println("The number two is greater");
		}
		else { 
			System.out.println("The number three is greater");
		}
		
		sc.close();

	}

}
