package Shop;

public class Product extends ShopKeeper {
    int productId;
    String name;
    int price;
    public Product(int quantity,int productId,String name,int price){
        super(quantity);
        this.name=name;
        this.price=price;
        this.productId=productId;
    }
    public String getProductdetails(){
        return "…[INFO] Product…\n"+"Product id: "+productId+"\nProduct name: "+name+"\nProduct price: "+price+"\nBill: "+getBill();
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getBill() {
        return quantity*price;
    }
}
