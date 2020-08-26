package me.akhilesh;

public class Account {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public Account(){

    }
    //this constructor in java...they're  kind of setters.
    public Account(long accountNumber, double balance, String customerName, String email, String phone){
       this.accountNumber = accountNumber;
       this.balance = balance;
       this.customerName = customerName;
       this.email = email;
       this.phone = phone;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount>this.balance){
            System.out.println("You don't have sufficient balance in your account");
        }else{
            System.out.println("Transaction has been processed successfully......");
            this.balance -= withdrawAmount;
            System.out.println("Your remaining balance is : "+this.balance);
        }
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
