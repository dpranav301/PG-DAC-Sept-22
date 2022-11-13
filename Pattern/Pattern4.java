class Pattern4
{
	public static void main(String args[])
	{
		int i,j,k,space=5;
		int num;
		for(i=0;i<5;i++)
		{
			for(j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			num=1;
			for(k=0;k<=i;k++)
			{
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			space--;
			System.out.println();
		}
	}
}