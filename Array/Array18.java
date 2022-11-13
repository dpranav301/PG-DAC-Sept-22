import java.util.*;
class Array18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Elemnt");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int temp[]=new int[n];
		int res=1;
		temp[0]=a[0];
		for(int i=1;i<n;i++)
		{
			if(temp[res-1]!=a[i])
			{
				temp[res]=a[i];
				res++;
			}
		}
		System.out.println("Duplicate Element");
		for(int i=1;i<res;i++)
			System.out.println(temp[i]);
	}
}