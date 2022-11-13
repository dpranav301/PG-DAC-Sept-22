class Pattern18
{
   public static void main(String args[])
   {
       int n=1;
    for(int p=1;p<=7;p++)
   
    {
        for (int i=7;i>=1;i--)
       {
           System.out.print(" ");
          
        }
       System.out.println("");
      
      
        for(int m=1;m<=p;m++)
        {
            System.out.print(m);
        }
              for(int y=p-1;y>=1;y--)
        {
            System.out.print(y);
        }
       System.out.println("");
    }
   }
}