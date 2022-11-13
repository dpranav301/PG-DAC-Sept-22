class Pattern19
{
	public static void main(String args[])
	{
		for(int i=1;i<=13;i++)
		{
			int z=i;
			if(i<=7)
			{
				for(int k=1;k<i;k++)
					System.out.print(" ");
				for(int j=7;j>=i;j--)
				{
					System.out.print(z++);
				}
				System.out.println();
			}
			else
			{
				for(int j=1;j<=13-i;j++)
					System.out.print(" ");
				for(int k=14-i;k<=7;k++)
				{z=k;
				System.out.print(z++);}
				System.out.println();
			}
		}
	}
}