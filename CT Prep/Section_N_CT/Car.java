package Section_N_CT;

public class Car extends Vehicle{
    private int numDoors;
    public Car(String make,int year,double price,int numDoors){
        super(make, year, price);
        this.numDoors=numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void showVehicleProperty(){
        super.showVehicleProperty();
        System.out.println("Number of Doors: "+numDoors);
    }
}
