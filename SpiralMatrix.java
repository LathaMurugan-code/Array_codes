package arr;
import java.util.Scanner;
public class SprialMatrix {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int n = sc.nextInt();
		int spiral[][]= new int [n][n];
		int min_row=0;
		int min_col=0;
		int max_row=n-1;
		int max_col=n-1;
		int val=1;
		while(val<= n*n)
		{
			for(int i=min_col;i<=max_col;i++)
			{
				spiral[min_row][i]=val;
				val++;
				}
			for(int i=min_row+1;i<=max_row;i++)
			{
				spiral[i][max_col]=val;
				val++;
				}
			for(int i=max_col-1;i>=min_col;i--)
			{
				spiral[max_row][i]=val;
				val++;
				}
			for(int i=max_row-1;i>=min_row+1;i--)
			{
				spiral[i][min_col]=val;
				val++;
				}
			min_row++;
			min_col++;
			max_row--;
			max_col--;
		}
		for (int i=0;i<spiral.length;i++)
		{
		 for(int j=0;j<spiral.length;j++)
		 {
			 System.out.print(spiral[i][j]+"\t"); 
		 }
			 System.out.println();
		}
		
		

	}

}
