import java.util.Scanner;
public class Test7
{
	public static void main(String args[])
	{
		System.out.println("_________Widening Tpecasting_________");
		byte a=105;
		short a1=a;
		System.out.println(a1);
		short b=68;
		char b1=(char)b;
		System.out.println(b1);
		char c='A';
		int c1=c;
		System.out.println(c1);
		int d=23;
		long d1=d;
		System.out.println(d1);
		long e=435346;
		float e1=e;
		System.out.println(e1);
		float f=89.1233F;
		double f1=f;
		System.out.println(f1);
		short g=234;
		double g1=g;
		System.out.println(g1);
		
	
		System.out.println("_________Noarrowing Tpecasting_________");
		double h=56.325D;
		float h1=(float)h;
		System.out.println(h1);
		long i=435346;
		int i1=(int)i;
		System.out.println(i1);
		char j='A';
		short j1=(short)j;
		System.out.println(j1);
		double k=456.325D;
		byte k1=(byte)k;
		System.out.println(k1);
		float l=89.1233F;
		long l1=(long)l;
		System.out.println(l1);
		int m=68;
		char m1=(char)m;
		System.out.println(m1);
		short n=333;
		double n1=(double)n;
		System.out.println(n1);		
		
	}
}