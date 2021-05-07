/*14. Write a java program to print an American flag on the screen */

class Assignment14
{
	public static void main(String args[])
	{
		String p1="* * * * * * ===================== \n * * * * *  =====================";
		String p2="=================================";
		for(int i=0;i<4;i++)
		{
			System.out.println(p1);
		}
		System.out.println("* * * * * * =====================");
		for(int j=0;j<6;j++)
		{
			System.out.println(p2);
		}
	}
}

/*OUTPUT :

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment14.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment14
* * * * * * =====================
 * * * * *  =====================
* * * * * * =====================
 * * * * *  =====================
* * * * * * =====================
 * * * * *  =====================
* * * * * * =====================
 * * * * *  =====================
* * * * * * =====================
=================================
=================================
=================================
=================================
=================================
=================================
*/