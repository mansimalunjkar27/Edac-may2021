class Pattern17
{
	public static void main(String args[])
	{
		int i ,j,c=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
				{
					c=c+1;
					System.out.print(c+" ");
					
				}
			System.out.println();	
		}
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\theory_session>javac Pattern17.java

C:\Users\MANSI\OneDrive\Desktop\cdac\theory_session>java Pattern17
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/