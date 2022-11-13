import java.util.*;
class Array20
{
// Efficient Approach

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the array Elemnt");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		seperate(a,n);
}
public static void seperate(int[] a,int n)
{
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]!=0)
		{
			a[count++]=a[i];
		}
	}
		while(count<n)
			a[count++]=0;
		
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}