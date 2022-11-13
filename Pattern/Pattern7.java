class Pattern7
{
	public static void main(String args[])
	{
		int i,j,k,count;
		for(i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				for( j=1;j<=5;j++)
				{
					if(j%2==0)
					{
						System.out.print('1');
					}
					else
						System.out.print('0');
				}
			}
			else
			{
					for( j=1;j<=5;j++)
				{
					if(j%2==0)
					{
						System.out.print('0');
					}
					else
						System.out.print('1');
				}
			}
			System.out.println();
		}
	}
	
}