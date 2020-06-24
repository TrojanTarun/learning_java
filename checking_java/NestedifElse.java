package checking_java;
import java.util.Scanner;

public class NestedifElse {

	public static void main(String[] args) {
		int result=0;
		var sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		System.out.println("Enter Third number:");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				result=a;
			} else {
				result=c;
			}
		} else {
			if(b>c) {
				result=b;
			} else {
				result=c;
			}
				
			System.out.println("largest of three numbers is"+result);	
			}
		}

	}
