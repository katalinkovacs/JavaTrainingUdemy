package account_2;


public class StartApp {

    public static void main(String[] args) {


        Customer customer1 = new Customer(1, "Katalin Kovacs");

        SavingsAccount sa1 = new SavingsAccount(1, 10000, 2);
        CreditAccount ca1 = new CreditAccount(2, 20000, 20000);
        PhoneNumber ph1 = new PhoneNumber(3535, "mobile");
        PhoneNumber ph2 = new PhoneNumber(4434, "home");
        PhoneNumber ph3 = new PhoneNumber(2345, "work");


        customer1.setSavingsAccount(sa1);
        customer1.setCreditAccount(ca1);
        customer1.setPhoneNumber(ph1);
        customer1.setPhoneNumber(ph2);
        customer1.setPhoneNumber(ph3);



        customer1.myAccounts.add(sa1);
        customer1.myAccounts.add(ca1);

        customer1.phoneNumbers.add(ph1);
        customer1.phoneNumbers.add(ph2);
        customer1.phoneNumbers.add(ph3);

        for(Account a : customer1.myAccounts){
            System.out.println(a.getClass());
            System.out.println(a.getAccountNumber());
            System.out.println(a.getBalance());

        }

        for(PhoneNumber phone : customer1.phoneNumbers){
            //System.out.println(phone.getClass());
            System.out.println(phone.getPhoneNumber());
            System.out.println(phone.getPhoneNumberType());

        }
    }

}
