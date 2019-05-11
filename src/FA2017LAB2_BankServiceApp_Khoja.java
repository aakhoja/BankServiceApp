import java.util.Scanner;

public class FA2017LAB2_BankServiceApp_Khoja {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String name;
		String accountNum;
		double balance;
		int checkAct = 0;
		Scanner reader = new Scanner(System.in);
		FA2017LAB2_CheckingAccout_Khoja bankAccountChecking = null;
		FA2017LAB2_SavingAccout_Khoja bankAccountSaving = null;
		boolean flag = false;
		
		while(true){
		System.out.print("1. Open new Account \n"
						+"2. Check current Balance \n"
						+"3. Deposit \n"
						+"4. Withdraw \n"
						+"5. Print Monthly Statement \n"
						+"0. Exit : ");
		choice = reader.nextInt();
		//System.out.println(flag);
		if((choice == 2 || choice == 3 || choice == 4 || choice == 5) && !flag){
			System.out.println("\nPlease make an account first.. \n");
		}
		else{
		
		switch(choice){
		case 1 : {
					flag = true;
					System.out.print("Account Name : ");
					Scanner scan1 = new Scanner(System.in);
					name = scan1.nextLine();
					System.out.print("Account Number : ");
					Scanner scan2 = new Scanner(System.in);
					accountNum = scan2.nextLine();
					System.out.print("Enter the intial balance : $");
					Scanner scan3 = new Scanner(System.in);
					balance = scan3.nextInt();
					System.out.print("Enter 1 for Checking Account or 2 for Saving Account : ");
					Scanner scan4 = new Scanner(System.in);
					checkAct = scan4.nextInt();
					
					if(checkAct == 1){
						bankAccountChecking = new FA2017LAB2_CheckingAccout_Khoja(name , accountNum, balance, 10);
					}
					else if(checkAct == 2){
						bankAccountSaving =  new FA2017LAB2_SavingAccout_Khoja(name , accountNum, balance, 1.5);
					}
					
					System.out.println("\n\nName : " + name);
					System.out.println("Number : " + accountNum);
					System.out.println("Balance : $" + balance );
					if (bankAccountChecking != null)
					{
						System.out.println("Type : " + "Checking Account");
						System.out.println("Monthly fee: $10" + "\n\n");
					}
					else
					{
						System.out.println("Type : " + "Saving Account");
						System.out.println("Interest Rate: 1.5%" + "\n\n");
					}
					
				}
				break;
		case 2 :
				//System.out.println("\n" + bankAccount.info +"Current Balance : " + bankAccount.checkCurrentBalance() + "\n");
				if(bankAccountChecking != null)
					bankAccountChecking.balance();
				else 
					bankAccountSaving.checkBalance();
				break;
		case 3 : 
				System.out.print("Enter the amount you want to deposit : $");
				if(bankAccountChecking != null)
					bankAccountChecking.deposit(reader.nextDouble());
				else
					bankAccountSaving.depositMoney(reader.nextDouble());
				break;
		case 4 : 
				System.out.print("Enter the amount you want to withdraw : $");
				if(bankAccountChecking != null)
					bankAccountChecking.withdraw(reader.nextDouble());
				else
					bankAccountSaving.withdrawMoney(reader.nextDouble());
				break;

				//bankAccount.withdrawMoney(reader.nextDouble());
		case 5 :
				if(bankAccountChecking != null)
					System.out.println(bankAccountChecking.printMonthlyStatement());
				else
					System.out.println(bankAccountSaving.printMonthlyStatement());
				break;

				//System.out.println(bankAccount.printMonthlyStatement());
		case 0 : 
				System.out.println("The application is terminating....");
				System.exit(0);
		default :
				System.out.println("Incorrect choice \n");
				
		
				}
			}
		
		}
	}
}

	

