class Countofodd80to40
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i=80;i>=40;i--)
		{
			if (i%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}