package ProgrammingTechniques;
import java.util.*;

public class PersonLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("Enter the age of Person : ");
		age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Issue License");
		}
		else {
			System.out.println("No License");
     	}	
		sc.close();

	}

}
