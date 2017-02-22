package account_3;


public class SavingsAccount extends Account {

    private int interest;

    //CONSTRUCTORS
    public SavingsAccount()
    {
        super();
    }

    public SavingsAccount(int accountNumber, int balance, int interest)
    {
        super(accountNumber, balance);
        this.interest = interest;
        //System.out.println("child constructor invoked");
    }

    //GETTER AND SETTER

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }


}
