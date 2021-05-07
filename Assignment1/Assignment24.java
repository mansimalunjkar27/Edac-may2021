/*24.write a java program to convert a binary number to a octal number. */
import java.util.*;
public class Assignment24 {
public static void main(String[] args) 
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");
 
    }
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment24.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment24
Input a Binary Number : 1111
Equivalent Octal Value of 1111 is :17
*/