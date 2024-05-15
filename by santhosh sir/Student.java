import java.io.*;
import java.util.*;
class Student
{
	private String name;
	private int age;
	void setName(String name)
	{
		this.name=name;
		System.out.println("name is local  "+name);
	}
	String getName()
	{
		//System.out.println("name is  "+name);
		return name;
	}
	void setAge(int age)
	{
		this.age=age;
		System.out.println("Age is local  "+age);
	}
	int getAge()
	{
		//System.out.println("name is  "+name);
		return age;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.setName("RAMU");
		//System.out.println("name is  "+s.name);
		s.getName();
		s.setAge(20);
		System.out.println("name is  "+s.getName());
		System.out.println("Age is  "+s.getAge());
	}

}


