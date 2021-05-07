class Pattern16
{
	public static void main(String args[])
	{
		int i ,j;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
				{
					System.out.print(j);
				}
			System.out.println();	
		}
	}
}
/*
OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern16.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern16
5
54
543
5432
54321

*/