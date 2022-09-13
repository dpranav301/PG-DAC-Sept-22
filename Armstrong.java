import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int i,j,k=0,z,a;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
i=s.nextInt();
z=i;
while(i<0)
{
j=i%10;
a=(j*j*j);
k=k+a;
i=i/10;
}
if(z==k)
{System.out.println("The number is armstrong");}
else
System.out.print("Not armstrong number");

}
}