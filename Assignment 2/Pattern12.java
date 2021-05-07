class Pattern12
{
	public static void main(String args[])
	{
		int i ,j;
		
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(j<=i)
				{
				System.out.print(" ");}
				else
				{
					System.out.print(" "+j);
				}
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*output
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern12.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern12
     5
    4 4
   3 3 3
  2 2 2 2
  
  */