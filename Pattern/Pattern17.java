class Pattern17
{
	public static void main(String args[])
	{
		int i,j;
		int c;
		for(i=1;i<=7;i++)
		{
			c=7;
			for(j=1;j<=i;j++)
			{
				System.out.print(c--);
			}
			System.out.println();
		}
	}
}