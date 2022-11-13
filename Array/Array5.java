//Naive Approach
class Largest
{
	public static int largest(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean large=true;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					large=false;
					break;
				}
			}
			if(large==true)
				return i;
		}
		return -1;//This line never be reached because we can find atmost one element
	}
	public static int smallest(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean small=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					small=true;
					break;
				}
			}
			if(small==true)
					return i;
		}
		return -1;//This line never be reached because we can find atmost one element
	}
}
class Array5
{
	public static void main(String args[])
	{
		int[] a=new int[]{1,2,3,4,5};
		int i=Largest.largest(a);
		System.out.println("Largest element is="+a[i]);
		i=Largest.smallest(a);
		System.out.println("Smallest Elemnt is="+a[i]);
	}
}
//===================================================================================================
//Efficient Approach
/*
class Array5
{
    public static int largest(int a[])
    {
        int p=0,res;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>a[p])
            p=i;
        }
        return p;
    }
    public static int smallest(int a[])
    {
        int p=0,res;
        for(int i=0;i<a.length;i++)
        {
            if(a[p]>a[i])
            p=i;
        }
        return p;
    }
    public static void main(String args[])
    {
        int[] a=new int[]{11,22,3,454,5};
        int j=largest(a);
        System.out.println("Largest Element is="+a[j]);
        j=smallest(a);
         System.out.println("Smallest Element is="+a[j]);
    }
}
*/