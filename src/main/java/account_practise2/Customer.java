package account_practise2;

import java.util.ArrayList;

public class Customer {

    private int custNo;
    private String custName;
    public ArrayList<Account> myAccounts;


    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }





    public Customer(int custNo, String custName) {
        this.custNo = custNo;
        this.custName = custName;
        this.myAccounts = new ArrayList<Account>();
    }




}

