package arr;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {23,45,21,87,54};
		for(int j=0;j<a.length;j++)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[j]<a[i])
			{    int temp= a[j];
				a[j]=a[i];
				a[i]=temp;
				
			}
		}
		}
		//printing values after sort
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}


