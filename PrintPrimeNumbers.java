class PrintPrimeNumbers
{
	public static void main(String[] args)
	{
		int n=10,m=0;
		for(int i=2;i<=13;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					m=1;
					break;
				}
				else
				{
					m=0;
				}
			}
			
			if(m==0)
				System.out.println(i);
		}
	}
}