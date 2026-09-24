package ProgrammingTechniques;
import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter the Number");
		int n;
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			fact = fact *i;
		}
		System.out.println("The Factorial of Number is : "+ fact);
		
		sc.close();

	}

}
