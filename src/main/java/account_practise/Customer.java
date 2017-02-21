package account_practise;



public class Customer {

    private int custNo;
    private String custName;
    private SavingsAccount savingAccounts;
    private CreditAccount creditAccounts;

    private PhoneNo phonNo1;
    private PhoneNo phonNo2;
    private Email email1;
    private Email email2;

    public Email getEmail1() {
        return email1;
    }

    public void setEmail1(Email email1) {
        this.email1 = email1;
    }

    public Email getEmail2() {
        return email2;
    }

    public void setEmail2(Email email2) {
        this.email2 = email2;
    }

    public PhoneNo getPhoneNo1() {
        return phonNo1;
    }

    public void setPhoneNo1(PhoneNo phonNo1) {
        this.phonNo1 = phonNo1;
    }

    public PhoneNo getPhoneNo2() {
        return phonNo2;
    }

    public void setPhoneNo2(PhoneNo phonNo2) {
        this.phonNo2 = phonNo2;
    }



    public Customer() {
    }

    public Customer(int custNo, String custName) {
        this.custNo = custNo;
        this.custName = custName;

    }




    public String getCustName() {
        return custName;
    }

    public void setCustName(String custNameLocal) {
        custName = custNameLocal;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNoLocal) {
        custNo = custNoLocal;
    }

    public void setSavAccount(SavingsAccount savAccount) {
        savingAccounts = savAccount;
    }

    public SavingsAccount getSavAccount() {
        return savingAccounts;
    }

    public void setCreditAccount(CreditAccount credit) {
        creditAccounts = credit;
    }

    public CreditAccount getCreditAccount() {
        return creditAccounts;
    }
}

