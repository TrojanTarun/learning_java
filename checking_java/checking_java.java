package checking_java;
import java.util.Scanner;

public class checking_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		if (x%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		

	}

}
