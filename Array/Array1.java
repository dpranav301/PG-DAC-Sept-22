import java.util.Scanner;
class Array1
{
	public static void main(String args[])
	{
		int[] arr=new int[5];
		int i=0;
		System.out.println("Enter the nUmber of Array");
		Scanner sc=new Scanner(System.in);
		while(arr.length>i)
		{
			arr[i]=sc.nextInt();
			i++;
		}
		i=0;
		System.out.println("Display the elemnet");
		while(arr.length>i)
		{
			System.out.println(arr[i]);
			i++;
		}
	}
}