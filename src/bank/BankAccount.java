package bank;

public class BankAccount 
{
	private String owner;
	private double balance;
	
	BankAccount(String owner, double balance)
	{
		this.owner = owner;
		this.balance = Math.max(balance, 0.0);
	}
	

	public String getOwner()
	{
		return this.owner;
	}
	
	public double getbalance()
	{
		return this.balance;
	}
	
	public double withdraw(double amount)
	{
		if(amount <= this.balance)
		{
			return this.balance = this.balance - amount ;
		}
		return 0;
		
	}

	public double deposit(double amount)
	{
		if (amount > 0)
		{
			return this.balance = this.balance + amount ;
		}
		return 0;
	}
	
	
}

