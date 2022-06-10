package pk.biki;

public class BankAccount {
    private String AccountNumber;
    private double Balance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;

    public BankAccount(){
        this("12341",200.00,"mamali",
                "mamali@cmail.com","161816874618734");
        System.out.println("empty constructor called ");
    }
    public BankAccount(String accountNumber,double balance, String customerName
    , String email, String phoneNumber){

        this.Balance = balance;
        this.AccountNumber = accountNumber;
        this.CustomerName = customerName;
        this.Email = email;
        this.PhoneNumber= phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",100.00,customerName,email,phoneNumber);
    }

    public void DepositAmount (double depositAmount){
        this.Balance += depositAmount;
        System.out.println("Deposit  made of = " +depositAmount+ " new balance is = " + this.Balance );
    }
    public void WithdrawAmount (double withdrawlAmount){
        if (this.Balance - withdrawlAmount < 0){
            System.out.println("only " + this.Balance + " left so, withdraw not processed");
        }else {
            Balance -= withdrawlAmount ;
            System.out.println("withdrawl of " + withdrawlAmount + "processed. remaining balance is = " + this.Balance);
        }
    }

    public void setAccountNumber(String accountNumber){
        this.AccountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public void setBalance(double balance){
        this.Balance = balance;
    }
    public double getBalance(){
        return Balance;
    }
    public void setCustomerName(String customerName){
        this.CustomerName = customerName;
    }
    public String getCustomerName(){
        return CustomerName;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public String getEmail(){
        return Email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.PhoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return  PhoneNumber;
    }
}
