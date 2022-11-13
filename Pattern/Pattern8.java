class Pattern8
{
	public static void main(String args[])
	{
		int i,j;
		int count;
		for(i=1;i<=5;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
					
			}
			System.out.println();
		}
	}
}