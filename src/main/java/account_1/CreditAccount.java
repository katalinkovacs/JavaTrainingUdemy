package account_1;


public class CreditAccount extends Account{

    private int creditLimit;

    //CONSTRUCTOR

    public CreditAccount()
    {
        super();
    }

    public CreditAccount(int accountNumber, int balance, int creditLimit)
    {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }



    //SETTER AND GETTER

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {

        return creditLimit;
    }





}
