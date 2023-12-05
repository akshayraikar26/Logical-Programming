class Countofodd25to45
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i=25;i<=45;i++)
		{
			if (i%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}