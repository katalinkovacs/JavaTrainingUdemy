package account_3;

public class Email extends ContactInfo {

    private String email;

    //CONSTRUCTOR
    public Email(String details, String email) {
        super(details);
        this.email = email;
    }

    //GETTER - SETTER
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
