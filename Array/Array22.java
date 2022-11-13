// Java Program to convert
// Array to Set

import java.util.*;
import java.util.stream.*;

class Array22 {


	public static <T> Set<T> convertArrayToSet(T array[])
	{

		
		Set<T> set = new HashSet<>(Arrays.asList(array));

		
		return set;
	}

	public static void main(String args[])
	{
		
		String array[]
			= { "Mumbai", "Delhi", "Punjab" };

		
		System.out.println("Array: "
						+ Arrays.toString(array));

		
		Set<String> set = convertArrayToSet(array);

		
		System.out.println("Set: " + set);
	}
}
