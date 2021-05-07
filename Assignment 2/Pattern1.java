class Pattern1
{
	public static void main(String args[])
	{
		int i ,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
			System.out.println();	
		}
	}
}

/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern1.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern1
1
12
123
1234
12345
*/