import java.util.*;
class Array24
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Mumbai");
		list1.add("Delhi");
		list1.add("Punjab");
		String[] sa=new String[list1.size()];
		for(int i=0;i<list1.size();i++)
		{
			sa[i]=list1.get(i);
		}
		System.out.print("{");
		for(String str:sa)
		{
			System.out.print(str+" ");
		}
		System.out.print("}");
	}
}