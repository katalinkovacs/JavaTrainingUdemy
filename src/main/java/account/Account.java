package account;


abstract class Account {

    private int accountNumber;
    private int balance;


    //CONSTRUCTORS

    public Account()
    {

    }

    public Account(int accountNumber, int balance )
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        //System.out.println("parent constructor invoked");
    }


    // SETTER AND GETTER

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
