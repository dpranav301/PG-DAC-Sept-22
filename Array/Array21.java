/*How to convert Array to ArrayList there are basically three methods
  1) using Arrays.asList(array name)--> But the list that we is of fixed order so we can't add the element in it.
  There is one syntax by which can more elemnt in Arraylist
  
  List<Integer> list1=new ArrayList<Integer>(Arrays.asList(array_name));
  3)Second method is using Collections.addAll(arraylistname,name_of_Array_tobe_converted)*/
/* import java.util.*; 
class Array21
{
	public static void main(String args[])
	{
		String[] name1={"A","B","C","D","E"};
		List al=Arrays.asList(name1);
		System.out.print(al);
		//al.add("F");  we can't add more elemnts
		//System.out.print(al);
	}
}*/

import java.util.*;
class Array21
{
	public static void main(String args[])
	{
		String[] name1={"A","B","C","D","E"};
		List<String> list1=new ArrayList<String>(Arrays.asList(name1));
		System.out.println("Before addition of new Element"+"\n"+list1);
		list1.add("F");
		list1.add("G");
		System.out.println("After addition of new Element"+"\n"+list1);
	}
}