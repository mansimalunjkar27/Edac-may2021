/*13. Write a java program to print the area and perimeter of a rectangle.
width=5.5 Height=8.5 */
import java.lang.*;
class Assignment13
{
	public static void main(String [] args)
	{
		float width = 5.6F;
		float height = 8.5F;
		
		float area = width * height;
		float peri = 2 * (width + height);
		
		System.out.println("Area is 5.6* 8.5 = "+area);
		System.out.println("Perimeter is 2 * (5.6 + 8.5) = "+peri);
	}
}
/*OUTPUT :
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>javac Assignment13.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section>java Assignment13
Area is 5.6* 8.5 = 47.6
Perimeter is 2 * (5.6 + 8.5) = 28.2
*/
