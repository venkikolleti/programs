import java.io.*;
import java.util.*;
class Simple
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void Sum()
	{
		System.out.println("Enter A value:");
		a=sc.nextInt();
		System.out.println("Enter B value:");
		b=sc.nextInt();
		System.out.println("Sum is    "+(a+b));
	}
}
class Demo
{
	public static void main(String args[])
	{
		Simple s=new Simple();
		s.Sum();
		
	}

}
