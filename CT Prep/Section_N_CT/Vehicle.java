package Section_N_CT;

public class Vehicle {
    private String make;
    private int year;
    private double price;
    public Vehicle(String make,int year,double price){
        this.price=price;
        this.make=make;
        this.year=year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void showVehicleProperty(){
        System.out.println("Vehicle Information: ");
        System.out.println("Make: "+make);
        System.out.println("Year: "+year);
        System.out.println("Price: $"+price);
    }

}
