class Pattern18
{
	public static void main(String args[])
	{
		int i ,j;
		/*for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
				{
					System.out.print(""+j);
				}
		System.out.println();}*/
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(j<=i)
				{
				System.out.print(" "+(char)(j+64));}
				else
				{
					System.out.print(" "+(char)(i+64));
				}
			}
			/*for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}*/
			System.out.println();
		}
	}
}
/*OUTPUT
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern18.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern18
 A B C D
 A B C
 A B
 A
 
 */