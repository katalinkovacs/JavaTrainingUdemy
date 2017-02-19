package account_practise;


public class StartApp {



        public static void main(String[] args) {
            // TODO Auto-generated method stub


            //CreditAccount ca = new CreditAccount(101, 102, 103);
            //System.out.println(ca.toString());

            //Customer customer = new Customer();
            //System.out.println(customer.toString());


            //customer.setCreditAccount(ca);

            //System.out.println(customer.getCreditAccount().getAccountNumber());

            Customer customerKati = new Customer(1, "Kati");

            SavingsAccount sa1 = new SavingsAccount(11, 2000, 2);
            CreditAccount ca1 = new CreditAccount(22, 5000, 10000);
            PhoneNo ph1 = new PhoneNo(011111111);
            PhoneNo ph2 = new PhoneNo(012222222);
            //Email email1 = new Email("kati@com");
            Email email1 = new Email();
            email1.setEmail("kati.com");
            Email email2 = new Email("kati2@com");

            customerKati.setSavAccount(sa1);
            customerKati.setCreditAccount(ca1);
            customerKati.setPhoneNo1(ph1);
            customerKati.setPhoneNo2(ph2);
            customerKati.setEmail1(email1);
            customerKati.setEmail2(email2);


            //System.out.println(customerKati.getSavAccount());
            //System.out.println(customerKati.getCreditAccount());

            System.out.println(customerKati.getCustName());
            System.out.println(customerKati.getCustNo());

            System.out.println(customerKati.getPhoneNo1().getPhoneNumber());
            System.out.println(customerKati.getPhoneNo2().getPhoneNumber());
            System.out.println(customerKati.getEmail1());
            System.out.println(customerKati.getEmail2().getEmail());


            System.out.println(customerKati.getSavAccount().getAccountNumber());
            System.out.println(customerKati.getSavAccount().getBalance());
            System.out.println(customerKati.getSavAccount().getInterest());

            System.out.println(customerKati.getCreditAccount().getAccountNumber());
            System.out.println(customerKati.getCreditAccount().getBalance());
            System.out.println(customerKati.getCreditAccount().getCreditLimit());

            System.out.println("#############################################################");

            Customer customerZoli = new Customer(55, "Zoli");
            System.out.println(customerZoli.getCustName());
            System.out.println(customerZoli.getCustNo());

            CreditAccount caZoli = new CreditAccount(33, 3000, 3);
            SavingsAccount saZoli = new SavingsAccount(333, 6000, 15000);

            customerZoli.setCreditAccount(caZoli);
            customerZoli.setSavAccount(saZoli);

            PhoneNo phZoli1 = new PhoneNo(123456);
            PhoneNo phZoli2 = new PhoneNo(345678);

            Email emailZoli1 = new Email("zoli1@com");
            Email emailZoli2 = new Email("zoli2@com");

            customerZoli.setPhoneNo1(phZoli1);
            customerZoli.setPhoneNo2(phZoli2);
            customerZoli.setEmail1(email1);
            customerZoli.setEmail2(email2);


            System.out.println(customerZoli.getCreditAccount().getAccountNumber());
            System.out.println(customerZoli.getCreditAccount().getBalance());
            System.out.println(customerZoli.getCreditAccount().getCreditLimit());

            System.out.println(customerZoli.getSavAccount().getAccountNumber());
            System.out.println(customerZoli.getSavAccount().getBalance());
            System.out.println(customerZoli.getSavAccount().getInterest());

            System.out.println(customerZoli.getPhoneNo1().getPhoneNumber());
            System.out.println(customerZoli.getPhoneNo2().getPhoneNumber());
            System.out.println(customerZoli.getEmail1().getEmail());
            System.out.println(customerZoli.getEmail2().getEmail());






        }

    }


