package ProgrammingTechniques;
import java.util.*;

public class MultipleOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter the number : ");
		number = sc.nextInt();
		
		for(int i=number;i<100;i+=number) {
			System.out.println(i); 
		}
		
		sc.close();
	}

}
 