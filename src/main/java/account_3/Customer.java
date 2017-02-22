package account_3;

import java.util.ArrayList;


public class Customer {


    private int customerNumber;
    private String customerName;
    public ArrayList<Account> myAccounts;
    public ArrayList<ContactInfo> contacts;

    //REFERENCE
    private PhoneNumber phoneNumber;
    private Email emailAddress;
    private SavingsAccount savingsAccount;
    private CreditAccount creditAccount;

    //CONSTRUCTORS
    public Customer(int customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.myAccounts = new ArrayList<Account>();
        this.contacts = new ArrayList<ContactInfo>();
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

    //EMAIL
    public Email getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Email emailAddress) {
        this.emailAddress = emailAddress;
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

