class fibonacci
{
	public static void main(String[] args)	
	{
		System.out.println("Fibonacci Series: ");
		int a=1;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		while (c<13)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}