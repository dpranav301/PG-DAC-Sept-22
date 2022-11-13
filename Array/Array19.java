import java.util.*;
class Array19
{
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
		int sum=sum(a,n);
		System.out.println("Total Sum of array="+sum);
	}
	 public static int sum(int [] a,int n)
	 {
		 int sum=0;
		 for(int i=0;i<n;i++)
		 {
			 sum+=a[i];
		 }
		 return sum;
	 }
}