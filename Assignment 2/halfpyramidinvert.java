class halfpyramidinvert
{
	public static void main(String args[])
	{
		int i ,j;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			System.out.println();	
		}
	}
}
/*OUTPUT:
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac halfpyramidinvert.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java halfpyramidinvert
*****
****
***
**
*

*/