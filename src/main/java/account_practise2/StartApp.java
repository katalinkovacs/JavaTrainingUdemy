package account_practise2;


public class StartApp {



        public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber(1);
        sa.setBalance(100);
        sa.setInterest(50);

        CreditAccount ca = new CreditAccount();
        ca.setBalance(400);
        ca.setAccountNumber(2);
        ca.setCreditLimit(5000);


        Customer customer1 = new Customer(12,  "Katalin");

        customer1.myAccounts.add(sa);
        customer1.myAccounts.add(ca);



        System.out.println(customer1.getCustName());
        System.out.println(customer1.getCustNo());

        for(Account a : customer1.myAccounts){
            System.out.println(a.getClass());
            System.out.println(a.getAccountNumber());
            System.out.println(a.getBalance());

        }






        }

    }


