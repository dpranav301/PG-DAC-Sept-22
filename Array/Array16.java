import java.util.*;
class Array16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		int [] b=new int[4];
		int [] intersection=new int[9];
		int res=0;
		System.out.println("Enter the First array Elemnet");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the First array Elemnet");
		for(int j=0;j<4;j++)
		{
			b[j]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[i]==b[j])
				{
					intersection[res]=a[i];
					res++;
				}
			}
		}
		System.out.println("The intersection of two array is=");
		System.out.print("{");
		for(int i=0;i<res;i++)
		{
			System.out.print(intersection[i]+" ");
		}
		System.out.print("}");
		
	}
}
