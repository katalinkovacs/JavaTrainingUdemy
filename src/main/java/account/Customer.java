package account;

//import java.util.ArrayList;


public class Customer {


    private int customerNumber;
    private String customerName;

    //REFERENCE
    private PhoneNumber phoneNumber;
    private PhoneNumber phoneNumber2;
    private SavingsAccount savingsAccount;
    private CreditAccount creditAccount;

    //CONSTRUCTORS
    public Customer(int customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        //this.myAccounts = new ArrayList<Account>();
    }



    //SETTERS AND GETTERS
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    //SETTERS AND GETTERS

    //PHONENUMBER
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //PHONENUMBER2
    public PhoneNumber getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(PhoneNumber phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    //SAVINGSACCOUNT
    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    //CREDITACCOUNT
    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }


}

