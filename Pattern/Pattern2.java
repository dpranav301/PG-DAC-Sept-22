class Pattern2
{
	public static void main(String args[])
	{
		int x,y;
		x=1;
		y=7;
		for(int i=1;i<=5;i++)
		{
		if(i>1)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==x||j==y)
					System.out.print('*');
				else
					System.out.print(" ");
			}
			x++;
			y--;
			System.out.println();
		}
		else
		{
			for(int j=1;j<=9;j++)
			{
				System.out.print('*');
			}
		}
		}
	}
}