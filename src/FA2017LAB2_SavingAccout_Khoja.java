
public class FA2017LAB2_SavingAccout_Khoja extends FA2017LAB2_Accout_Khoja {

	private double interestRate;
	
	public FA2017LAB2_SavingAccout_Khoja(String name, String accountNumber, double balance , double interestRate) {
		// TODO Auto-generated constructor stub
		super(name, accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void changeIntestRate(double rate){
		interestRate = rate;
	}
	
	public void depositMoney(double amount){
		super.despositMoney(amount);
		System.out.println(super.toString() + "\nDeposit Amount: $" + amount + "\nType : Saving Account\n\n");
	}
	
	public void withdrawMoney(double amount){
		double n = super.checkCurrentBalance();
		super.withdrawMoney(amount);
		double m = super.checkCurrentBalance();
		if(m > 50)
		System.out.println( super.toString() + "\nWithdraw Amount : $" + amount + "\nType : Saving Account \n\n");
		else{
			System.out.println("Not enough money to withdraw $"+amount +"\n\n");
			super.despositMoney(amount);
		}
	}
	
	public void checkBalance(){
		
		System.out.println(super.toString() + "\nType : Saving Account\n\n");
	}
	
	public String printMonthlyStatement(){
		double amount = super.checkCurrentBalance() * (interestRate / 100 );
		double finalBal = super.checkCurrentBalance() - amount;
		String s = super.toString() + "\nType : Saving Account \nInterest Rate : %"+ interestRate + "\nInterest Amount : $" + amount + "\nBalance : $" + finalBal + "\n\n"; 
		return s;
	}

}
