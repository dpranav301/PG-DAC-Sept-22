class Pattern1
{
public static void main(String args[])
{
	
	int x,y;
	x=y=4;
	for(int i=1;i<=5;i++)
	{
		if(i<=4)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==x||j==y)
					System.out.print('*');
				else
					System.out.print(" ");
			}
			x--;
			y++;
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
