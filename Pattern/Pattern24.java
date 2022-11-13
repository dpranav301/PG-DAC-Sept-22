class Pattern24
{
	public static void main(String args[])
	{
		int count;
		for(int i=1;i<=7;i++)
		{
			count=i;
			for(int j=7;j>=i;j--)
			{
				System.out.print(count+++" ");
			}
			count=i;
			if(i>=2)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print((count-j)+" ");
				}
			}
			System.out.println();
		}
		
	}
}