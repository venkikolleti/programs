import java.io.*;
import java.util.*;
class Student
{
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	public void StudentDetails()
	{
		System.out.println("Enter student Details:");
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your Age:");
		age=sc.nextInt();
	}
}
 class Marks extends Student
{
	int marks[]=new int[5];
	int i,sum=0;
	float avg;
	void readmarks()
	{
	System.out.println("Enter your Marks:");
	for(i=0;i<5;i++)
	{
		marks[i]=sc.nextInt();
		sum=sum+marks[i];
	}
	avg=sum/5;
	}
		
}
class Result extends Marks
{
	void Show()
	{
		System.out.println("Student Details are:");
		System.out.println("Name is  :"+name);
		System.out.println("Age is  :"+age);
		System.out.println("Sum is :"+sum);
		System.out.println("Avg is  :"+avg);
	}
}
 class Demo
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.StudentDetails();
		r.readmarks();
		r.Show();
	}
}
