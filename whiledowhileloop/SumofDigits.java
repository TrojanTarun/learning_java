package whiledowhileloop;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum=0;
		while(temp>0) {
			int lastdigit = temp%10;
			sum=sum+lastdigit;
			temp=temp/10;	
		}
		System.out.println("sum of digits of "+n+" is "+sum);
		

	}

}
