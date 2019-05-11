
public class FA2017LAB2_Accout_Khoja {
	
	protected String name;
	protected String accountNumber;
	protected double balance;
	
	public FA2017LAB2_Accout_Khoja(){
		
	}
	public FA2017LAB2_Accout_Khoja(String na, String actNum, double bal){
		name = na;
		accountNumber = actNum;
		balance = bal;
		//System.out.println(na + actNum + bal);
	}
	
	public void despositMoney(double amount)
	{
		balance += amount;
	}
	
	public void withdrawMoney(double amount)
	{
		balance -= amount;
	}
	
	public double checkCurrentBalance(){
		
		return balance; 
	}
	
	public String printMonthlyStatement(){
		return toString();
	}
	
	public String toString(){
			
		return "\n\nAccount Name : " + name + "\n" + 
				"Account Number : " + accountNumber + "\n" +
				"Current Balance : $" + checkCurrentBalance();
				
	}
	
	

}
