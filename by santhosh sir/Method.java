class Method
{
	int sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.print("the sum is:" +sum);
		return  sum;
	}
	void sum(int a,int b)
	{
		System.out.print("the sum is:" +(a+b));
	}
	public static void main(String args[])
	{
		Method sc=new Method();
		int c,d;
		c=sc.sum();
		System.out.print("the sum is:" +c);
		sc.sum(30,40);
	}
	
}

