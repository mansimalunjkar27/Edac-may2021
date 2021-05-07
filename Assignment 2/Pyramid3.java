class Pyramid3
{
	public static void main(String args[])
	{
		int i,j,k,z=1;
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=z;k++)
			{
				System.out.print("*");
			}
			z+=2;
			System.out.println(" ");
			
		}
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pyramid3.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pyramid3
     *
    ***
   *****
  *******
 *********
***********
*/