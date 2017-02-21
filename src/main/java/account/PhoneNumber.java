package account;


public class PhoneNumber {

    private int phoneNumber;
    private String phoneNumberType;

    //CONSTRUCTOR

    public PhoneNumber(int phoneNumber, String phoneNumberType) {
        this.phoneNumber = phoneNumber;
        this.phoneNumberType = phoneNumberType;
    }

    //GETTER AND SETTER

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {

        return phoneNumber;
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }
}
