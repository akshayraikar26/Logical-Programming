class Sumofeven75to105
{
	public static void main(String[] args)
	{
		int sum=0;
		for (int i=75;i<=105;i++)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}