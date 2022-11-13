class Pattern23
{
	public static void main(String args[])
	{
		int x,y,z;
		for(y=1;y<=5;y++)
		{
			z=y;
			for(x=0;x<=y-1;x++)
			{
				if(x==0)
					System.out.print(z+" ");
				else
				{
					z=z+(10-(5+x));
					System.out.print(z+" ");
				}
			}
			System.out.println();
		}
	}
}