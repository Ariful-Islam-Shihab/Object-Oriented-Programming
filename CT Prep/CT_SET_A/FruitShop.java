package CT_SET_A;

public class FruitShop {
    public static void main(String[] args) {
        FruitShop fruit1=new FruitShop("Apple",3.5,110);
        FruitShop fruit2=new FruitShop("Mango",5,90);
        fruit1.reducePricePerKilo(10);
        fruit2.increasePricePerKilo(20);
        fruit1.printDetails();
        fruit2.printDetails();
    }
    String name;
    double weight;
    double pricePerKilo;
    public FruitShop(String name,double weight,double pricePerKilo){
        this.name=name;
        this.weight=weight;
        this.pricePerKilo=pricePerKilo;
    }
    public void increasePricePerKilo(double in){
        this.pricePerKilo+=in;
    }
    public void reducePricePerKilo(double re){
        this.pricePerKilo-=re;
    }
    public void printDetails(){
        System.out.println("Fruit details: ");
        System.out.println("Name: "+name);
        System.out.println("weight: "+weight+"kg");
        System.out.println("Price Per Kilo: "+pricePerKilo);
        System.out.println("Total bill: "+weight*pricePerKilo);
        System.out.println();
    }
}
