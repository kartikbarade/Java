package JavaLanguageBasic;
import java.util.*;

public class AdditionOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2,add;
		
		System.out.println("Enter the 1st Number : ");
		n1 = sc.nextInt();
		System.out.println("Enter the 2nd Number : ");
		n2 = sc.nextInt();
		
		add = n1+n2;
		System.out.println("The addition of Two Numbers is "+add);
		
		sc.close();

	}

}
