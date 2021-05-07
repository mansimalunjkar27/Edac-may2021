class Pattern3
{
	public static void main(String args[])
	{
		int i ,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			System.out.println();	
		}
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern3.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern3
*
**
***
****
*****

*/