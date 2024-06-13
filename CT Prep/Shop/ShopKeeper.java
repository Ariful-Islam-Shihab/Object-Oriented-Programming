package Shop;

public class ShopKeeper {
    int quantity;
    ShopKeeper(int quantity){
        this.quantity=quantity;
    }
    public double getBill(){
        return 50;
    }

    public int getQuantity() {
        return quantity;
    }
}
