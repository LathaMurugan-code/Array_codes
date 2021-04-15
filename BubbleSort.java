package arr;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {20,5,8,45,4};
		for(int j=1;j<a.length;j++)
		{
		for(int i=0;i<a.length-j;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		System.out.println("After bubble sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
