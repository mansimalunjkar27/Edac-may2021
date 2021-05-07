class Pattern2alpha
{
	public static void main(String args[])
	{
		int alpha=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha + j)+" ");
			}
			//alpha++;
			System.out.println();
		}
	}
}
/*OUTPUT:
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern2alpha.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern2alpha
A
A B
A B C
A B C D
A B C D E

*/