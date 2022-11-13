
import java.util.ArrayList;
class collections7
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kedar");
		list.add("Rohit");
		list.add("Dhoni");
		list.add("Surya");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+".)"+list.get(i));
		}
	}
}