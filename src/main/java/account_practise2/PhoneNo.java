package account_practise2;


public class PhoneNo {


    private int phNo;
    private String phNoType;

    public PhoneNo()
    {

    }

    public PhoneNo(int phNo)
    {
        this.phNo = phNo;
    }





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

