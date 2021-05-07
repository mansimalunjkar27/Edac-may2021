class Pyramid1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=9;j>i;j--)
			{
				if(j>i)
				{
				System.out.print(" ");}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
	}
}

/* OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac Pyramid1.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java Pyramid1
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 */