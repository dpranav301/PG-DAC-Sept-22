import java.util.*;
class Array14 //Naive Approach
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4};
		int [] b={1,2,3,4};
		System.out.println("Equal comparison using Naive method");
		System.out.println("=======================================");
		for(int i=0;i<4;i++)
		{
			boolean swap=false;
			if(a[i]!=b[i])
				swap=true;
			if(swap==true)
				{System.out.println("Not equal");
					break;}
			else
				{System.out.println("Equal");break;}
		}
				System.out.println("=======================================");
				System.out.println("Comparison using public boolean equals()");
				boolean c=Arrays.equals( a ,  b);
				if(c==true)
					System.out.println("Equal");
				else
					System.out.println("Not Equal");
	}


}

