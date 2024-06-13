package CT_SET_A;

public class OrderBooth {
    String cakeType;
    int quantity;
    public OrderBooth(String cakeType,int quantity){
        this.cakeType=cakeType;
        this.quantity=quantity;
    }
    public  double getTotalBill(){
        if(this.cakeType.equals("Chocolate cake"))
        return quantity*250.00;
        return quantity*280.00;
    }

}
