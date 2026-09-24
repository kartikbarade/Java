package JavaLanguageBasic;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter the Character : ");
		ch = sc.next().charAt(0);
		
		int ascii = (int)ch;
		System.out.println("ASCII Value : "+ ascii);
		 
		sc.close();

	}

}
