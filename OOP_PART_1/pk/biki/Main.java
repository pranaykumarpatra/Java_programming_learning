package pk.biki;
public class Main{
    public static void main(String[] args) {
       BankAccount pkAccount = new BankAccount("221840",
               100.00,"PRANAY",
               "pkpatra13@gmail.com","+91-9861132416");


       pkAccount.setAccountNumber("201840");
       pkAccount.setCustomerName("pranay kumar patra");
       pkAccount.setEmail("pkpatra13@gmail.com");
       pkAccount.setPhoneNumber("+91-9861132416");
       pkAccount.setBalance(0.00);
       pkAccount.WithdrawAmount(100.0);

       pkAccount.DepositAmount(50.0);
       pkAccount.WithdrawAmount(100.0);

       pkAccount.DepositAmount(100);
       pkAccount.WithdrawAmount(50);

       BankAccount mamaliAccount = new BankAccount("Mamali","mamali@gmail.com","12345");
        System.out.println(mamaliAccount.getCustomerName());


        VipCustomer person1= new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 =new VipCustomer("pranay",5000000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());


        VipCustomer person3 = new VipCustomer("mamali",2863672637263.00,"mamali@emial.com");
        System.out.println(person3.getName());
    }
}
