/* 22.Write a java program to convert a binary number to decimal number. */
import java.util.Scanner;
public class Assignment22 {
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  long binary, decimal = 0, j = 1, remainder;
  System.out.print("Input a binary number: ");
  binary = sc.nextLong();

  while (binary != 0) 
  {
   remainder = binary % 10;
   decimal = decimal + remainder * j;
   j = j * 2;
   binary = binary / 10;
  }
  System.out.println("Decimal Number: " + decimal);
 }
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment22.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment22
Input a binary number: 101
Decimal Number: 5

*/