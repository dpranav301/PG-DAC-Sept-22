import java.util.*;
class Array4
{
	 static void reverse(Character a[])
	{
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void main(String args[])
	{
		Character [] a={'A','B','C','D'};
		System.out.print("Reverse of an Array");
		/*for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(" "+a[i]+" ");
		}*/
		reverse(a);
	}
}