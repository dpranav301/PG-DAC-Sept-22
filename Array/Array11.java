class Array11
{
	public static void main(String args[])
	{
		byte[] byteArray = { 'T', 'E', 'C', 'H', 'N', 'O','L','O','G','Y'}; //byte array of characters  
		byte[] byteArray1 = { 84, 69, 67, 72, 78, 79, 76, 79, 71, 89};    //array of ASCII values 
		byte[] bytes = "hello world".getBytes();         //convert String to byte Array  
		String s = new String(byteArray);               //converts byteArray to String  
		String str = new String(byteArray1); 
		String str1 = new String(bytes);     
		System.out.println(s);  
		System.out.println(str); 
		System.out.println(str1);
		//This method use to print array bytes which prints ascii value of "hello world"
		for(byte b:bytes)
		{
			System.out.println(b);
		} 
	}
}

/*To convert String s1 into  byte data type we use method call as s1.getBytes()*/

