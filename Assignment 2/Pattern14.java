class Pattern14
{
	public static void main(String args[])
	{
		int i ,j;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
			System.out.println();	
		}
	}
}
/*Putput :
C:\Users\MANSI\OneDrive\Desktop\cdac\theory_session>javac Pattern14.java

C:\Users\MANSI\OneDrive\Desktop\cdac\theory_session>java Pattern14
12345
1234
123
12
1
*/