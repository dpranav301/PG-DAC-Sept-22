class Pattern5
{
	public static void main(String args[])
	{
		int i,j,count=0;
		for(i=1;i<=7;i++)
		{
			if(i<=4)
			{
				for(int s=4;s>i;s--)
				System.out.print(" ");
				count=count+i;
				for(j=1;j<=i;j++)
				{
					System.out.print(count);
					count--;
				}
				count=2;
				for(int z=1;z<i;z++)
				{
					System.out.print(count);
					count++;
				}
				count=0;
				System.out.println();
			}
			else
			{
				int k=i-4;
				count=4;
				for(int s=1;s<=k;s++)
					System.out.print(" ");
				count=count-k;
				for(j=3;j>=k;j--)
				{
					System.out.print(count);
					count--;
				}
				count=2;
				for(j=3;j>k;j--)
				{
					System.out.print(count);
					count++;
				}
				System.out.println();
			}
			
		}
	}
}