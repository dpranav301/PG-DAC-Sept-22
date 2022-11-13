class Array10
{
	public static void decision(int a[],int b[],int c[])
	{
		for(int j=0;j<a.length;j++)
		{
			boolean swap=false;
		for(int i=0;i<a.length;i++)
		{
			 swap=false;
			if(a[j]>a[i+1])
			{
				swap=true;
				int temp=a[i+1];
				a[i+1]=a[j];
				a[j]=temp;
			}
			if(swap==false)
			System.out.println("Ascending");
			break;
		}
		}
	}
	public static void main(String args[])
	{
		int a[]={15,14,35,90,139};
		int b[]={88,67,35,14,-12};
		int c[]={65,14,129,34,7};
		decision(a,b,c);
	}
}