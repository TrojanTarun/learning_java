package whiledowhileloop;
import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		do {
			n=sc.nextInt();
			System.out.println("number "+n);
		}while(n!=0);

	}

}
