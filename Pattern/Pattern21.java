class Pattern21
{
	public static void main(String args[])
	{
		int x,y;
		for(int i=1;i<=7;i++)
		{
			x=1;
			if(i==1||i==7)
			{
				for(int j=1;j<=7;j++)
					System.out.print(i);
			}
			else
			{
				for(int j=1;j<=7-i;j++)
				{
					System.out.print(x);
				}
				for(int j=7;j>7-i;j--)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}