package arr;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int [4][4];
			Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array elements for matrix A");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array elements for matrix B");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		//addition
	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				 c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				
				 System.out.print(c[i][j]+" ");
			}
		}
	}

}
