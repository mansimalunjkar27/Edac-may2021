/*7.Write a Java program that takes a number as input and prints its multiplication table upto 10*/
public class Assignment7
{
	public static void main(String args[])
	{
		int i,x=8;
		for(i=1;i<=10;i++)
		{	int c=i*x;
			System.out.println(i+"*"+x+"="+c);
		}
	}
}
/*OUTPUT:

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment7.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment7
1*8=8
2*8=16
3*8=24
4*8=32
5*8=40
6*8=48
7*8=56
8*8=64
9*8=72
10*8=80
*/