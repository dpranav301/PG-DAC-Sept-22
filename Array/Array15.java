class Array15
{
	public static void main(String args[])
	{
		System.out.println("Program to Find Missing elemnt");
		int [] a=new int[100];       //int[] a = IntStream.range(1, 100).toArray(); another method to add 1 to 100 number
		int i;
		for( i=1;i<=99;i++)
		{
			a[i]=i;
		}
		int sum=100*101/2;   //N*(N+1)/2
		//long sumArray=0;
		for(i=0;i<100;i++)
		{
			sum-=a[i];
		}
		
		System.out.println("Missing Elemnt is="+sum);
	}
}