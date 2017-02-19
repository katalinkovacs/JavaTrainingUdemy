package account_practise;


public class SavingsAccount extends Account {

    private int interest;

    public SavingsAccount()
    {
        super();
    }

    public SavingsAccount(int accountNumber, int balance, int interestConstructor)
    {
        super(accountNumber, balance);
        interest = interestConstructor;
        //System.out.println("child constructor invoked");
    }

    public int getInterest()
    {
        return interest;
    }

    public void setInterest(int interestLocal)
    {
        interest = interestLocal;
    }

}






