public class star7
{
	public static void main(String args[])
	{
	int  i, j, space = 4;
		for (j = 1; j<= 5; j++)
		{
			for (i = 1; i<= space; i++)
			{
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j<= 5 - 1; j++)
		{
			for (i = 1; i<= space; i++)
			{
				System.out.print(" ");
			}
			space++;
			for (i = 1; i<= 2 * (5 - j) - 1; i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac star7.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java star7
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/