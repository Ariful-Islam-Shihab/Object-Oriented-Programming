package CT_SET_A;

public class CashCounter {
    double bill;
    public CashCounter(double bill){
        this.bill=bill;
    }
    public void payandGetStatus(double bill){
        if(this.bill==bill){
            System.out.println("Order received successfully and wait for 10 minutes");
        }else{
            System.out.println("Order cancelled");
        }
    }
}
