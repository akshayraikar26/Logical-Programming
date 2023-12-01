/* Write a pogram to print "FIZZ BUZZ" if the number divisible by 3 & 7 or print "FIZZ FIZZ" 
if the number divisible by 3 or print "BUZZ BUZZ" divisible by 7 or print "invalid number"? */

class Eg8
{
	public static void main(String[] args)
	{
		int i=21;
		if (i%3==0 && i%7==0)
		{
			System.out.println("FIZZ BUZZ");
		}
		else if (i%3==0)
		{
			System.out.println("FIZZ FIZZ");
		}
		else if (i%7==0)
		{
			System.out.println("BIZZ BUZZ");
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}
}
