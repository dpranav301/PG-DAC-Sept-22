class Pattern11
{
	public static void main(String args[])
	{
		char c='A';
		for(int i=1;i<=12;i++)
		{
			if(i<=6)
			{
				
				char d=c;
			for(int j=6;j>=i;j--)
			{
				System.out.print(d++);
			}
			System.out.println();
			}
			else
			{
				char d=c;
				for(int j=7;j<=i;j++)
				{
					System.out.print(d++);
				}
				System.out.println();
				
			}
		}
		
	}
}