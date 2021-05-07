class Pattern11
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
					System.out.print(" *");
				}
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
/* OUTPUT :

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pattern11.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pattern11
     *
    * *
   * * *
  * * * *
  
  */