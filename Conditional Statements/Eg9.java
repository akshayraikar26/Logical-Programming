/* Write a pogram to print "Yes it is divisible by both" if the number divisible by 2 & 8 or print 
"It is divisible by 2" if the number divisible by 2 or print "It is divisible by 8" if the number is 
divisible by 8 or print invalid number? */

class Eg9
{
	public static void main(String[] args)
	{
		int i=16;
		if (i%2==0 && i%8==0)
		{
			System.out.println("Yes it is divisible by both");
		}
		else if (i%2==0)
		{
			System.out.println("It is divisible by 2");
		}
		else if (i%8==0)
		{
			System.out.println("It is divisible by 8");
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}
}