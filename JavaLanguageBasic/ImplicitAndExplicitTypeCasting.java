package JavaLanguageBasic;
import java.util.Scanner;

public class ImplicitAndExplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,s4,s5; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 Subject marks : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();
		
		float avg = (float)(s1+s2+s3+s4+s5)/5; //Explicit TypeCasting
		
		System.out.println("The Average of markes is "+avg);
		
		
		sc.close();

	}

}
