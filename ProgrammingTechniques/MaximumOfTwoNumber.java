package ProgrammingTechniques;
import java.util.Scanner;

public class MaximumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		n1 = sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("1st number is Maximum");
		}
		else {
			System.out.println("2nd number is Maximum");
		}
		 
		sc.close();

	}

}
