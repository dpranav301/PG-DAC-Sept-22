class Pattern22
{
	public static void main(String args[])
	{
		//int count;
		for(int i=1;i<=7;i++)
		{
			if(i%2==0)
			{
				//count=0;
				for(int j=1;j<=7;j++)
				{
					if(j%2==0)
						System.out.print('1');
					else
						System.out.print('0');
				}
			}
			else
			{
				for(int j=1;j<=7;j++)
				{
					if(j%2==0)
						System.out.print('0');
					else
						System.out.print('1');
				}
			}
			System.out.println();
			
		}
	}
}