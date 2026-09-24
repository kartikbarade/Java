package ProgrammingTechniques;
import java.util.Scanner;

public class NumberPostiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		
		if(number>=0){
			System.out.println("The number is Positive");
		}
		else {
			System.out.println("The number is Negative");
		}
		
		sc.close();

	}
}
