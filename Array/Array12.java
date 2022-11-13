import java.util.*;
class Array12  //Rotating Right and Left By Naive Appproach
{
	
	public static void leftRotate(int [] a)
	{
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		
	}
	public static void rightRotate(int [] a)
	{
		int temp=a[a.length-1];
		for(int i=1;i<a.length;i++)
		{
			a[i+1]=a[i];
		}
		a[0]=temp;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int [] a={1,2,3,4,5};
		System.out.println("Enter How many Times left rotation");
		int L=sc.nextInt();

		for(int i=0;i<L;i++)
			{leftRotate(a);}

		//System.out.print(Arrays.toString(a));
		for(int str:a)
		{
			System.out.print(str+" ");
		}
		
		System.out.println("Enter How many Times Right rotation");
		int R=sc.nextInt();

		for(int i=0;i<R;i++)
			{leftRotate(a);}
			System.out.print(Arrays.toString(a));
	}
}