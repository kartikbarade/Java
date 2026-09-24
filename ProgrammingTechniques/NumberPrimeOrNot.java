package ProgrammingTechniques;
import java.util.*;
public class NumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		if(n>1){
			for(i=2;i<n;) {
				if(n%i==0) {
					System.out.println("The number is Not a prime number");
					break;
				}
				else {
					System.out.println("The number is a prime number");
					break;
				} 
			}
		}
		
		sc.close();
		

	}

}
