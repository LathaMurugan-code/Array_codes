package arr;

public class ArrayFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {10,20,30,40,30,20,10,30,40,40,20};
int []freq = new int [a.length];
for(int j=0;j<a.length;j++)
{
	int no=a[j];//assign array mem 10 to int no
	int count=1;//count of 10 as '1'
for(int i=j+1; i<a.length;i++)//loop starting from next element
{
if(no==a[i])//a[6]==10
	{count++;//count=2
freq[i]=-1;//mark it as 1
	}//freq[6]=-1

}
if(freq[j]!=-1)
freq[j]=count;//freq[0]=2
}
//printing array members and its occurence
for(int i=0;i<a.length;i++)
{
	if(freq[i]>0)
	System.out.println(a[i]+" occurs "+freq[i]);
}
//finding maximum occurence
int max=0;
for(int i=0;i<freq.length;i++)
{
	if(freq[i]>max)
		max=freq[i];
}
System.out.println("maximum occurence is "+max);
	}

}
