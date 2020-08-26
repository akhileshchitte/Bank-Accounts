package me.akhilesh;

public class Main {

    public static void main(String[] args) {

        Account akhilesh = new Account();
        akhilesh.setBalance(4005);
        akhilesh.setCustomerName("Akhilesh Chitte");
        akhilesh.setEmail("akhilesh@hotmail.co.uk");
        akhilesh.setPhone("9405553044");
        System.out.println("The Account Number is : " +akhilesh.getAccountNumber());
        System.out.println("The Account Balance is : " +akhilesh.getBalance());
        System.out.println("The name of account holder is : "+akhilesh.getCustomerName());
        System.out.println("The email address of account holder is : "+akhilesh.getEmail());
        System.out.println("The phone number of account holder is : "+akhilesh.getPhone());
        akhilesh.deposit(5000);
        akhilesh.withdraw(8000);

        //new Constructor
        Account pratik = new Account(645001003544L,8000,"Pratik Dumal","pratikdumal1998@gmail.com","9403407079");
        pratik.withdraw(15000);
        System.out.println(pratik.getBalance());
        System.out.println(pratik.getAccountNumber());



    }
}
