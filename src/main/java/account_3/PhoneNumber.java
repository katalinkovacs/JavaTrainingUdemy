package account_3;


public class PhoneNumber extends ContactInfo {

    private int phoneNumber;
    private String phoneNumberType;

    //CONSTRUCTOR

    public PhoneNumber( String details, int phoneNumber, String phoneNumberType) {
        super(details);
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
