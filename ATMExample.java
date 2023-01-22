package task3;
import java.util.Scanner;
public class ATMExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			//declare and intialize balance,withdraw,and deposit
			int balance = 100000,withdraw,deposit;
			//create scanner class object to gZet choice of user
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("Automated Teller Machine");
				System.out.println("Choose 1 for withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for EXIT");
				System.out.println("Choose the operation you want to perform ");
				
				//get choice from user
				int choice = sc.nextInt();
				switch(choice)
				
				{
				case 1:
					System.out.println("Enter money to be withdrawn:");
					
					//get the withdrawl money from user
					withdraw = sc.nextInt();
					
					//check whether the balance is greaterthan or equal to thewithdrawal amount
					if(balance>=withdraw)
					{
						//remove the withdrwal amount from the total balance
						balance = balance-withdraw;
						System.out.println("Please collect your money");
						
					}
					else
					{
						//show custom error message
						System.out.println("Insufficient Balance");
					}
						System.out.println("");
						break;
						
				
						case 2:	
				
						System.out.println("Enter money to be deposited:");
						
						//get deposit amount from the user
						deposit = sc.nextInt();
						
						//add the deposit amount to the total balance
						balance = balance + deposit;
						System.out.println("your money has been successfully deposited");
						System.out.println("");
						
						break;
						
						case 3:
							//displaying the total balance to the user
							System.out.println("Balance :"+balance);
							System.out.println("");
							
							break;
							
						case 4:
							//Exit from the menu
							System.exit(0);
					}
				}
				
			}
		}
		
	}


