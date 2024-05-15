import java.io.*;
import java.util.*;
class Sample
{
	Sample()
	{
		System.out.println("This is default constructor:");
	}
	Sample(int a,int b)
	{
		System.out.println("This is parameterized constructor:");
		System.out.println("Sum is  :"+(a+b));
	}
	Sample(int c,int d,int e)
	{
		System.out.println("This is parameterized constructor:");
		System.out.println("Sum is  :"+(c+d+e));
	}
	Sample(int c,String s)
	{
		System.out.println("This is parameterized constructor:");
		System.out.println("Name is :"+s+" \nC value is  :"+c);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Sample s=new Sample();
		Sample s1=new Sample(20,30);
		Sample s2=new Sample(50,90,100);
		Sample s3=new Sample(30,"RAMU");
	}
}
