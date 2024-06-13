package CUSTOMER;

public class Account {
    String phoneNumber;
    double balance;
//    public Account(){
//
//    }
    public Account(String phoneNumber,double balance){
        this.phoneNumber=phoneNumber;
        this.balance=balance;
    }
    public void withdraw(String s,double bill){
        if(bill<=balance)
            balance-=bill;
    }
    public double balanceInquiry(){
        return balance;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
