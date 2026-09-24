package ProgrammingTechniques;

import java.util.Scanner;

public class AreaOFCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r;
		double pi = 3.14,area;
		System.out.println("Enter the radius : ");
		r = sc.nextInt();
		
		area = pi*r*r;
		System.out.println("The area of circle is "+area);
		sc.close();


	}

}
