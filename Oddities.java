
public class Oddities
{
	public static void main(String args[])
	{
		int numOfItems = nextInt();
		int n = args[0];
		boolean found = false;

		for (int i = 0; i < numOfItems; i++)
		{
			for (int j = 1; j <= 10; j++
			{
				int x = 2 * j;
				if (x == n) found = true;
			}
			if (found) System.out.println(n " is even.");
			else System.out.println(n " is negative.");
		
		}
	}
}
