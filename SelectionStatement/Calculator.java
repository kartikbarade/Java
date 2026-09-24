package SelectionStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 , num2 , result;
		
		System.out.print("Enter the 1st number : ");
		num1 = sc.nextInt();
		
		System.out.print("Enter the 2nd number : ");
		num2 = sc.nextInt();
		
		System.out.println("Enter your Choice 1/2/3/4 ::-");
		int num;
		num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("Perform the Addtion");
			result = num1 + num2 ;
			System.out.println("The Addition is : "+result);
			break;
			
		case 2 : 
			System.out.println("Perform the Substraction");
			result = num1 - num2 ;
			System.out.println("The Substraction is : "+result);
			break;
			
		case 3 : 
			System.out.println("Perform the Multiplication");
			result = num1 * num2 ;
			System.out.println("The Multiplication is : "+result);
			break;
			
		case 4 : 
			System.out.println("Perform the Division");
			result = num1 / num2 ;
			System.out.println("The Division is : "+result);
			break;
			
			
		default :
			System.out.println("Error: Invalid choice ...");
            break;
			
		}
		
		
		sc.close();

	}

}
