class star9
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac star9.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java star9
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/