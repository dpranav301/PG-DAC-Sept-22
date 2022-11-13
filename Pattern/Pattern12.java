class Pattern12
{
	public static void main(String args[])
	{
		char c='A';
		for(int i=1;i<=6;i++)
		{
			char d=c;
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print(d+++" ");
			System.out.println();
		}
	}
}