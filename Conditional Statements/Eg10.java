/* Write a program to initialize amount as 6000, use condition in such a way that if amount is greater than 2000 & 
it should check another condition i.e., whether the amount is greater than 5000 if so print "Premium Version",
if not print "Normal Version" or else print go to home ? */

class Eg10
{
	public static void main(String[] args)
	{
		int amt=6000;
		if (amt<2000)
		{
			if (amt>5000)
			{
				System.out.println("Premium Version");
			}
		else
		{
			System.out.println("Normal Version");
		} 
		}
		else
		{
			System.out.println("Go to home");
		}
	}
}