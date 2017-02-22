package account_1;


public class StartApp {

    public static void main(String[] args) {


        Customer customer1 = new Customer(1, "Katalin Kovacs");

        SavingsAccount sa1 = new SavingsAccount(1, 10000, 2);
        CreditAccount ca1 = new CreditAccount(2, 20000, 20000);
        PhoneNumber ph1 = new PhoneNumber(3535, "mobile");
        PhoneNumber ph2 = new PhoneNumber(4434, "home");


        customer1.setSavingsAccount(sa1);
        customer1.setCreditAccount(ca1);
        customer1.setPhoneNumber(ph1);
        customer1.setPhoneNumber2(ph2);


        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getCustomerNumber());

        System.out.println(customer1.getPhoneNumber().getPhoneNumber());
        System.out.println(customer1.getPhoneNumber().getPhoneNumberType());

        System.out.println(customer1.getPhoneNumber2().getPhoneNumber());
        System.out.println(customer1.getPhoneNumber2().getPhoneNumberType());

        System.out.println(customer1.getSavingsAccount().getAccountNumber());
        System.out.println(customer1.getSavingsAccount().getBalance());
        System.out.println(customer1.getSavingsAccount().getInterest());

        System.out.println(customer1.getCreditAccount().getAccountNumber());
        System.out.println(customer1.getCreditAccount().getBalance());
        System.out.println(customer1.getCreditAccount().getCreditLimit());
    }

}
