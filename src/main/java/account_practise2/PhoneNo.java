package account_practise2;


public class PhoneNo {

    public PhoneNo()
    {

    }

    public PhoneNo(int phNo)
    {
        this.phNo = phNo;
    }

    private int phNo;
    private String phNoType;



    public String getPhNoType() {
        return phNoType;
    }

    public void setPhNoType(String phNoType) {
        this.phNoType = phNoType;
    }

    public void setPhoneNumber(int number)
    {
        phNo = number;
    }

    public int getPhoneNumber(){

        return phNo;
    }



}

