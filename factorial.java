class factorial
{
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println("Factorial of "+n+" is: "+ fact(n));
	}

	static int fact(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
	return fact;
	}
}