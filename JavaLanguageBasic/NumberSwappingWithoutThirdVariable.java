package JavaLanguageBasic;

import java.util.Scanner;

public class NumberSwappingWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("The Value of a after Swapping is : "+a);
		System.out.println("The Value of b after Swapping is : "+b);
		
		sc.close();

	}

}
