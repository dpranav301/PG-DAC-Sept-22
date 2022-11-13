class Pattern14
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			int c=i;
			for(int k=1;k<i;k++)
				System.out.print(" ");
			for(int j=6;j>=i;j--)
			{
				System.out.print(" "+c++);
			}
			System.out.println();
		}
	}
}