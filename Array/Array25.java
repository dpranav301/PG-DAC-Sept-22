import java.util.*;
class Array25
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to find Second largest elemnt");
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the Elemnt in Array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int i=secondLargest(a);
		System.out.println("The secondlargest elemnt is="+a[i]);
	}
	public static int secondLargest(int[] a)
	{
		int i=largest(a);
			int res=-1;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]!=a[i])
				{
					if(res==-1)
						res=j;
					else if(a[j]>a[res])
						res=j;
				}
			}
			return res;
	}
	public static int largest(int[] a)
	{
		int high=0;
		for(int i=0;i<a.length;i++)
		if(a[i]>a[high])
			high=i;
		return high;
	}
}