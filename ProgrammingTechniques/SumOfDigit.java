package ProgrammingTechniques;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,sum=0;
		System.out.println("Enter the Number : ");
		number = sc.nextInt();
		
//	   int a = number%10;
//	   number = number/10;
//	   
//	   int b = number%10;
//	   number = number/10;
//	   
//	   int c = number%10;
//	   number = number/10;
//		
//	   sum = a+b+c;
//	   
//	   System.out.println(sum);
		
		for(int i=0;i<=number;i++) {  
			sum = sum + number %10; 
			number = number/10;
		}
		
		System.out.println(sum);
		
		
		
		sc.close();
		

	}

}
