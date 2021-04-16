package arr;

public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3},{4,6}};
		int b[][]= {{3,2},{7,1}};
		int c[][]= {{0,0},{0,0}};
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				for(int k=0;k<=1;k++)
				{
				 c[i][j] += a[i][k]*b[k][j];
					}
			 }
		 }
		
		for(int i=0;i<=1;i++)
		{   
			System.out.print("|	");
			for(int j=0;j<=1;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("	|");
		}
 }

}
