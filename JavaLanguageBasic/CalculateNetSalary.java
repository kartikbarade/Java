package JavaLanguageBasic;
import java.util.Scanner;

public class CalculateNetSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int BS;
		
		System.out.print("Enter your Basic Salary : ");
		BS = sc.nextInt();
		System.out.println("The Basic Salary is "+BS);
		
		float HRA = (float)(BS*20)/100;
		System.out.println("The HRA is : "+HRA);
		
		float DA = (float)(BS*40)/100;
		System.out.println("The DA is : "+DA);
		
		
		float GS = BS+HRA+DA;
		System.out.println("Your Gross Salary is : "+GS);
		
		float PF = (GS*10)/100;
		System.out.println("The PF is : "+PF);
		
		float NS = GS - PF;
		System.out.println("The Net Salary is "+NS);
		
		
		
		
		 
		sc.close();

	}

}
