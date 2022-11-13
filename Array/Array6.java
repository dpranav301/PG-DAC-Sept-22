class Array6
{
	public static int largestM(int a[])
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[res])
				res=i;
		}
		return res;
	}
	public static int secondlarg(int a[])
	{
		int z=largestM(a);
		int res=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[z])
			{
				if(res==-1)
					res=i;
				else if(a[i]>a[res])
					res=i;
			}
		}
		return res;
	}
	public static int thirdlarg(int a[])
	{
		int y=secondlarg(a);
		int b=largestM(a);
		int res=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[y]&&a[i]!=a[b])
			{
				if(res==-1)
					res=i;
				else if(a[i]>a[res])
					res=i;
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		int[] a={24,54,31,16,82,45,67};
		int z=thirdlarg(a);
		System.out.println("Third Largest Element is="+a[z]);
	}
}