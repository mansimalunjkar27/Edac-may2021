/*6.Write a java program to print the sum (addition),multiply,subtract,divide and reminder of two numbers.*/
import java.lang.*;
import java.util.Scanner;
class Assignment6
{
	public static void main(String args[])
	{
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter First number : ");
		int n1=sc.nextInt();
		System.out.println(" enter Second number : ");
		int n2=sc.nextInt();
		ans=n1+n2;
		System.out.println(" 125+24: "+ans);
		ans=n1-n2;
		System.out.println(" 125-24: "+ans);
		ans=n1*n2;
		System.out.println(" 125*24 : "+ans);
		ans=n1/n2;
		System.out.println(" 125/24 : "+ans);
		ans=n1%n2;
		System.out.println(" 125 mod 24 : "+ans);
	}
}
/*OUTPUT:
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment6.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment6
 enter First number :
125
 enter Second number :
24
 125+24: 149
 125-24: 101
 125*24 : 3000
 125/24 : 5
 125 mod 24 : 5
*/