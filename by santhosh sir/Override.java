import java.io.*;
import java.util.*;
class Shape
{
	
	void area()
	{
		System.out.println("Area of formula:");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area of Rectangle:");	
	}
}
class Traingle extends Shape
{
	void area()
	{
		System.out.println("Area of Traingle:");	
	}
}
class Demo
{
	public static void main(String args[])
	{
		Shape s;
		s=new Rectangle();
		s.area();
		
		s=new Traingle();
		s.area();
	}
}
