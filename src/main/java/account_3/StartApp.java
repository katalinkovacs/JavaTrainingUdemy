package account_3;


public class StartApp {

    public static void main(String[] args) {


        Customer customer1 = new Customer(1, "Katalin Kovacs");

        SavingsAccount sa1 = new SavingsAccount(1, 10000, 2);
        CreditAccount ca1 = new CreditAccount(2, 20000, 20000);
        PhoneNumber ph1 = new PhoneNumber("First contact, anytime.", 3535, "mobile");
        PhoneNumber ph2 = new PhoneNumber("Call between 18-20.", 4434, "home");
        PhoneNumber ph3 = new PhoneNumber("Call between 9-16.", 2345, "work");
        Email email1 = new Email("First email", "email@gmail");
        Email email2 = new Email("Second email", "email@yahoo");


        customer1.setSavingsAccount(sa1);
        customer1.setCreditAccount(ca1);
        customer1.setPhoneNumber(ph1);
        customer1.setPhoneNumber(ph2);
        customer1.setPhoneNumber(ph3);
        customer1.setEmailAddress(email1);
        customer1.setEmailAddress(email2);


        customer1.myAccounts.add(sa1);
        customer1.myAccounts.add(ca1);

        customer1.contacts.add(ph1);
        customer1.contacts.add(ph2);
        customer1.contacts.add(ph3);
        customer1.contacts.add(email1);
        customer1.contacts.add(email2);


        for (ContactInfo ci : customer1.contacts) {
            System.out.println(ci.getClass());
            System.out.println(ci.getDetails());      //DETAILS FROM CONTACTINFO

            if (ci instanceof Email){
                System.out.println("this is an email contact");
                Email e = (Email) ci;
                System.out.println (e.getEmail());
            }
        }



        /*
        for(Account a : customer1.myAccounts){
            System.out.println(a.getClass());
            System.out.println(a.getAccountNumber());
            System.out.println(a.getBalance());
            if (a instanceof SavingsAccount){
                System.out.println("this is a saving acc");
                SavingsAccount sa = (SavingsAccount) a;
                System.out.println (sa.getInterest());
            }
        }

        */


        }
    }

