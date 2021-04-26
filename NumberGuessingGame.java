package numbergame;
import java.util.Random;
import java.util.Scanner;  

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int num = r.nextInt(10000);
		System.out.println(num);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any four digit Number");
		int user_num = sc.nextInt();
		int a[]= new int[4];
		for(int i=3;i>=0;i--)
		{
		int rem = num%10;
		a[i]=rem;
		num = num/10;
		}
		System.out.println("Guess number");
		for(int i=0;i<4;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("User number");
		int b[]= new int[4];
		for(int i=3;i>=0;i--)
		{
		int rem = user_num%10;
		b[i]=rem;
		user_num = user_num/10;
		}
		for(int i=0;i<4;i++) {
			System.out.print(b[i]+" ");
		}

		

	}

}
