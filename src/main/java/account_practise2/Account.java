package account_practise2;


public abstract class Account {

    public Account()
    {

    }

    public Account(int accountNumber, int balance )
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        //System.out.println("parent constructor invoked");
    }

    private int accountNumber;
    private int balance;

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNo)
    {
        accountNumber = accountNo;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balanceLocal)
    {
        balance = balanceLocal;
    }


}
