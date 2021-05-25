
import java.util.ArrayList;
import java.util.Scanner;
class BankApplication1
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter how many customer data you want enter .");
			int n=sc.nextInt();
			BankAccount c[]=new BankAccount[n];
			for(int i=0;i<c.length;i++)
			{
				c[i]=new BankAccount();
				c[i].openAccount();
				c[i].showMenu();
			}
			
		}
		
}
class Bank
{
	int balance;
	int previousTransaction;
	static String customerName;
	static String customerId;
	static String branch;
	Scanner scanner=new Scanner(System.in);
	void deposite(int amount)
	{
		if(amount<0)
		{
			System.out.println("Invalid Amount .");
		}
		balance+=amount;
		previousTransaction=amount;

	}
	void withdraw(int amount)
	{
		if (balance < amount) {
			System.out.println("Not sufficient balance.");
		}
		if (amount < 0) {
			System.out.println("Invalid Amount");
		}
		balance-=amount;
		previousTransaction=-amount;
	}
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposite : "+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("withdraw : "+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occured ");
		}
	}
	void openAccount()
	{
		System.out.println("Enetr Branch Name : ");
		branch=scanner.nextLine();
	}
}

class BankAccount extends Bank
{
		void openAccount()
		{
			System.out.print("Enetr Account No :");
			customerId=scanner.nextLine();
			System.out.println("Enter Name : ");
			customerName=scanner.nextLine();			
		}
		void showAccount()
		{
			System.out.println("Account No : "+customerId+"\n"+"Name :"+customerName+"\n"+"Balanch : "+balance);
		}
		public void showMenu()
		{
			char option='\0';
			
			//System.out.println("Welcome : "+customerName);
			//System.out.println("Your Id Is : "+customerId);
			System.out.println("\n");
			System.out.println("A. Show Account ");
			System.out.println("B. Check Balance ");
			System.out.println("C. Deposite ");
			System.out.println("D. Withdraw ");
			System.out.println("E. Privious Transaction ");
			System.out.println("F. Exit ");
			do
			{
				System.out.println("**********************************************************");
				System.out.println("Enter an option : ");
				System.out.println("**********************************************************");
				option=scanner.next().charAt(0);
				System.out.println("\n");
				switch(option)
				{
				case 'A':
					showAccount();
					break;
				case 'B':
					System.out.println("Balance = "+balance);
					break;
				case 'C' :
					System.out.println("The an amount to deposite : ");
					int amount1=scanner.nextInt();
					deposite(amount1);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("Enetr an amount to withdraw");
					int amount2=scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'E':
					getPreviousTransaction();
					break;
				case 'F':
					System.out.println();
					break;
				default:
					System.out.println("Invalid option. please enter again ......");
					break;
				}
			}while(option != 'F');
			System.out.println("Thank You For Using Our Service.");
		}
}
