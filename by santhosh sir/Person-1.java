import java.io.*;
import java.util.*;
class Person
{
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	void personDetails()
	{
		System.out.println("Enter Details  :");
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Enter your Age :");
		age=sc.nextInt();
	}
}
class Student extends Person
{
	int id;
	float cgpa;
	void StudentDetails()
	{
		System.out.println("Enter your ID no :");
		id=sc.nextInt();
		System.out.println("Enter your CGPA :");
		cgpa=sc.nextFloat();
	}
	void Show()
	{
		System.out.println("Student Details are:");
		System.out.println("Name is  :"+name);
		System.out.println("Age is  "+age);
		System.out.println("ID no is:"+id);
		System.out.println("CGPA is  :"+cgpa);	
	}
}
class Teacher extends Person
{
	int empid;
	float salary;
	void TeacherDetails()
	{
		personDetails();
		System.out.println("Enter your emp ID no :");
		empid=sc.nextInt();
		System.out.println("Enter your salary :");
		salary=sc.nextFloat();
	}
	void Show1()
	{
		System.out.println("Teache Details are:");
		System.out.println("Name is  :"+name);
		System.out.println("Age is  "+age);
		System.out.println("ID no is:"+empid);
		System.out.println("CGPA is  :"+salary);	
	}

}
class Demo
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.personDetails();
		s.StudentDetails();
		s.Show();
		Teacher t=new Teacher();
		t.TeacherDetails();
		t.Show1();		
	}

}
