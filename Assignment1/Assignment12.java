/* 12. Write a java program that takes three numbers as input to calculate and print the average of the numbers. */
import java.util.Scanner;
class Assignment12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		System.out.println("Average of three number : "+(n1+n2+n3)/3);
		
	}
}
/* OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment12.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment12
 enter number :
10
20
30
Average of three number : 20
*/