import java.util.*;
class Array8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the Elemnts of Array");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		double c[]=new double[size-2];
		while(size>=3)
		{
			for(int i=0;i<size-2;i++)
			{
				double sum=0.0;
				int z=i;
				while(z<=i+2)
				{
					sum+=a[z];
					z++;
				}
				c[i]=sum/3;
			}
			System.out.print(Arrays.toString(c));
			break;
		}
		//System.out.print(Arrays.toString(c));
		//for(double s:c)
		//{
			//System.out.println(s);
		//}
	}
}