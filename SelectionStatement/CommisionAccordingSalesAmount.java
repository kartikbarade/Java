package SelectionStatement;

import java.util.Scanner;

public class CommisionAccordingSalesAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int BS,SA;
		double commission = 0;
		
		System.out.print("Enter your Basic Salary : ");
		BS = sc.nextInt();
		
		System.out.print("Enter the Total Sales Amount : ");
		SA = sc.nextInt();
		
		if(SA >= 5000 && SA<= 7500) {
			System.out.println("Commission is rate 3%");
			commission = SA * 0.03;
			System.out.println("Earned Commission : "+commission);
		}
		
		else if(SA>=7501 && SA<=10500) {
			System.out.println("Commission is rate 8%");
			commission = SA * 0.08;
			System.out.println("Earned Commission : "+commission);
		}
		else if(SA>=10501 && SA<=15000) {
			System.out.println("Commission is rate 11%");
			commission = SA * 0.11;
			System.out.println("Earned Commission : "+commission);
		}
		else if(SA>=1500) {
			System.out.println("Commission is rate 15%");
			commission = SA * 0.15;
			System.out.println("Earned Commission : "+commission);
		}
		
		
		double net_salary = BS + commission ;
		System.out.println("The net salary is  "+net_salary);
		
		
		
		sc.close();
		
		
		

	}

}
