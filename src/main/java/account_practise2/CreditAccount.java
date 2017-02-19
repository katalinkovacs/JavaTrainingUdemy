package account_practise2;

public class CreditAccount extends Account
{

    private int creditLimit;

    public CreditAccount()
    {
        super();
    }

    public CreditAccount(int accountNumber, int balance, int creditLimit)
    {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }



    public int getCreditLimit()
    {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimitLocal)
    {
        creditLimit = creditLimitLocal;
    }


}


