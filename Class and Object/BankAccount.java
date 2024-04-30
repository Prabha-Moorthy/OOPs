public class BankAccount
{
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.setBalance(1000);
		b.setAccountNo(92101089);
		b.setAccountType("Savings Account");
		System.out.println(b.getBalance());
		System.out.println(b.getAccountNo());
		System.out.println(b.getAccountType());
	}
}

class Bank
{
	private int balance;
	private long accountNo;
	private String accountType;
	
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public long getAccountNo()
	{
		return accountNo;
	}
	public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	public String getAccountType()
	{
		return accountType;
	}
	public void setAccountType(String accountType)
	{
		this.accountType=accountType;
	}
}
