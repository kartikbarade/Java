package JavaLanguageBasic;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num1,num2,temp;
		System.out.print("Enter the 1st Number : ");
		num1 = sc.nextInt();
		
		System.out.print("Enter the 2nd Number :  ");
		num2 = sc.nextInt();
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The number 1st after swapping : "+num1);
		System.out.println("The number 2nd after swapping : "+num2);
		
		
		sc.close();		

	}

}
