public class star14
{
    public static void main(String[] args)
    {
        int n=6;        
        for (int i= 0; i<= n-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=n-1; k++) 
			{ 
				System.out.print("*" + " "); 
			} 
			System.out.println(""); 
		} 
		for (int i= n-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=n-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
/*OUTPUT:
C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>javac star14.java

C:\Users\MANSI\OneDrive\Desktop\cdac\practical_section\Assignment2>java star14
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/