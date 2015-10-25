class CheckPrimeNumber
{
	public static void main(String[] args)
	{
		int n=31;
		boolean result = isPrime(n);
		if(result==true)
			System.out.println(n+" is Prime");
		else
			System.out.println(n+" is Not Prime");
	}
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}