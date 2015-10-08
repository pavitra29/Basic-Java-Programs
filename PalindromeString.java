class PalindromeString
{
	public static void main(String[] args)
	{
		String s="madam",reverse="";
		for(int i=s.length()-1;i>=0;i--)
			reverse = reverse + s.charAt(i);
		
		if(s.equals(reverse))
			System.out.println(s + " is a Palindrome");
		else
			System.out.println(s + " is not a Palindrome");
	}
}