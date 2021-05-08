import java.util.Scanner;
class Test3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number :");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int temp;
		System.out.println("Before Swapping");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swapping");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
	}
}