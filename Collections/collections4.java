import java.util.*;
class collections4
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(45);
		list.add(4567);
		list.add(47;
		
		
		
		System.out.println("List Before Sorting");
		for(int i : list)
		{
			System.out.print(i+"\t");
		}
		
		
		Collections.sort(list);
		
		System.out.println("List After Sorting");
		for(int i : list)
		{
			System.out.print(i+"\t");
		}
	}
}