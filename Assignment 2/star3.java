class star3
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
/*OUTPUT :

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac star3.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java star3
*****
****
***
**
*
*/