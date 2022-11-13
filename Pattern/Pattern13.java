class Pattern13
{
	public static void main(String args[])
	{
		int x,y;
		x=y=6;
		char ch='A';
		for(int i=1;i<=6;i++)
		{
			if(i<=6)
			{
				
				for(int j=1;j<=12;j++)
				{
				if(j==x||j==y)
					System.out.print(ch);
				
				else
					System.out.print(" ");
			}
				ch++;
				x--;
				y++;
				System.out.println();
			}
		}
		ch='E';
		x=2;
		y=10;
		for(int i=7;i<12;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j==x||j==y)
					System.out.print(ch);
				else
					System.out.print(" ");
			}
			ch--;
			x++;
			y--;
			System.out.println();
		}
		
		
	}
}