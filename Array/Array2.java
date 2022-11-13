import java.util.*;
class Array2
{
	public static void main(String args[])
	{
		int[] a1={1,2,3,4,5};
		int[] a2={1,2,3,4,5};
		boolean b=Arrays.equals(a1,a2);
		System.out.println(b);
	}
}


// It is also use to compare user defined object
/*class Student
{
	int roll;
	String name;
	int age;
	Student(int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	public boolean equals(Student s)
	{
		return this.roll==s.roll&& this.name.equals(s.name)&& this.age==s.age;
	}
}
class Array2
{
	public static void main(String args[])
	{
		Student s1=new Student(1,"Pranav",23);
		Student s2=new Student(1,"Pranav",23);
		boolean b=s1.equals(s2);
		System.out.println(b);
	}
}*/