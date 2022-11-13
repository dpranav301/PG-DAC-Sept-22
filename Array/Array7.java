import java.util.*;
class Array7
{
	public static void mergesort(int a[],int b[],int m,int n)
	{
		int c[]=new int[m+n];
		for(int i=0;i<m;i++)
			c[i]=a[i];
		for(int j=0;j<n;j++)
			c[m+j]=b[j];
		Arrays.sort(c);
		System.out.print(Arrays.toString(c));
	}
	public static void main(String args[])
	{
		System.out.println("Enter the size of First Array");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter the size of second element");
		int n=sc.nextInt();
		int a[]=new int[m];
		System.out.println("Enter Array of first element");
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		System.out.println("Enter the elemnts of second array");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		mergesort(a,b,m,n);
	}
}