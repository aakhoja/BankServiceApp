
public class FA2017LAB2_CheckingAccout_Khoja extends FA2017LAB2_Accout_Khoja {
	
	private double monthlyFee;
	public String info;

	public FA2017LAB2_CheckingAccout_Khoja(String name, String accountNumber, double balance, double monthlyFee){
		super(name, accountNumber, balance);
		this.monthlyFee = monthlyFee;
		//System.out.println(accountNumber + "------");
		//this.info = "\nAccount Name: " + name;
	}
	
	public void balance(){
		double amt = super.checkCurrentBalance();
		System.out.println(super.toString() + "\nType : Checking Account \n\n");
	}
	
	public void deposit(double amount){
		super.despositMoney(amount);
		System.out.println( super.toString() + "\nDeposit Amount : $" + amount +"\nType : Checking Account \n\n");
	}
	
	public void withdraw(double amount){
		double n = super.checkCurrentBalance();
		super.withdrawMoney(amount);
		double m = super.checkCurrentBalance();
		if(m > 20)
		System.out.println( super.toString() + "\nWithdraw Amount : $" + amount + "\nType : Checking Account \n\n");
		else{
			System.out.println("Not enough money to withdraw $"+amount +"\n\n");
			super.despositMoney(amount);
		}
	}
	
	public String printMonthlyStatement(){
		double bal = super.checkCurrentBalance() - monthlyFee;
		String s = super.toString() +"\nType : Checking Account \nMonthly Fee : $"+monthlyFee + "\nNew Balance : $" + bal + "\n\n";
		return s;
	}

}
