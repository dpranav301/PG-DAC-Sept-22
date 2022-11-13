import java.util.Scanner;
class Array3
{
	public static void main(String args[])
	{
		int[] a1={1,2,3,4,5};
		int[] a2={1,3,2,4,7};
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<a1.length;i++)
		{
			s1:for(int j=0;j<a2.length;j++)
			{
				if(a1[i]+a2[j]==n)
				{
					System.out.println("The pair of "+a1[i]+" and "+a2[j]+" equals to "+n);
				}
				else
				{
					System.out.println("Pair Not Found");
					
				}
					
			}
		}
	}
}