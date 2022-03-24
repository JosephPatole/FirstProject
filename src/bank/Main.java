package bank;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount AccountDataOne= new BankAccount("Joseph",2500);
		BankAccount AccountDataTwo= new BankAccount("Huzefa",3500);
		AccountDataTwo.withdraw(300);
		AccountDataTwo.withdraw(3000);
		AccountDataTwo.withdraw(1000);
		AccountDataTwo.deposit(300);
		System.out.println(AccountDataOne.getbalance());
		System.out.println(AccountDataTwo.getbalance());
	
	
	}

}
