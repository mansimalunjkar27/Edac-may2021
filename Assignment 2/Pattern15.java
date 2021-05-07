class Pattern15
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern15.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern15
54321
5432
543
54
5

*/