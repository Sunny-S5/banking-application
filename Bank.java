package projects;
import java.util.Scanner;

public class Bank{

	public static void main(String[] args) {
		//creating banking application
		Bankdetails obj=new Bankdetails("Sunny","S1234567");
		obj.showmenu();

	}
}
class Bankdetails
{
	int Balance;
	String customerName;
	String customerId;
	
	public Bankdetails(String cname,String cid)
	{
		customerName=cname;
		customerId=cid;
	}
	
	void deposit(int amount) {
	if(amount!=0) {
		Balance=Balance+amount;
	}
}
	void withdraw(int amount) {
		if(amount!=0) {
			Balance=Balance-amount;
		
		}
	}
	
	void showmenu() {
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome:"+customerName);
		System.out.println("your id:"+customerId);
		System.out.println("\n");
		
		System.out.println("C: Check Your Balance");
		System.out.println("D: Deposit");
		System.out.println("W: Withdraw");
		System.out.println("E: Exit the program");

		do {
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("enter your option");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			option=scanner.next().charAt(0);
			System.out.println("\n");

			switch(option){
			case'C':
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Balance= "+Balance);
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\n");
                 break;
                 
			case'D':
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Enter the amount to deposit");
				System.out.println("-------------------------------------------------------------------");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
                 break;
                 
			case'W':
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Enter the amount to withdraw");
				System.out.println("-------------------------------------------------------------------");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
                 break;
                 
			case'E':
					System.out.println("================================================================");
				break;
				
				default:
					System.out.println("Invalid option entered");
                 break;	
                 }
		}

while(option != 'E');
System.out.println("Thank you for using our services!!Have a nice day");
	}
}
