class Sumofeven112to75
{
	public static void main(String[] args)
	{
		int sum=0;
		for (int i=112;i>=75;i--)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}