package CUSTOMER;

import Shop.Product;

import java.util.Objects;

public class Customer extends Account {
    String customerName;
    String customerPassword;
    public Customer(double balance,String phoneNumber,String customerName,String customerPassword){
        super(phoneNumber,balance);
        this.customerName=customerName;
        this.customerPassword=customerPassword;
    }
    public double buy(Product p){
        System.out.println(p.getProductdetails());
        return p.getBill();
    }
    public void payment(String customerPassword,String phoneNumber,double bill){
        if(Objects.equals(customerPassword, this.customerPassword)){
            if(balance>=bill){
                balance-=bill;
                System.out.println("......Payment Succesfull......\n…[INFO] CURRENT BALANCE: "+balance+" …\n");
            }else{
                System.out.println("...[Error]...Insuffiecient Balance");
            }
        }else{
            System.out.println("...[Error]..PASSWORD INCORRECT!!!");
        }
    }
    public String customerInfo(){
        return "…[INFO] CUSTOMER…\n"+"Customer name: "+customerName+"\nPhone number: "+phoneNumber;
    }
}
