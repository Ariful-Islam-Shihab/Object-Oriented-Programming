package CT_SET_C;

public class Vehicle {
    double baseFare,durationFare=2,distanceFare;
    double distance;
    public Vehicle(double distance,double baseFare,double distanceFare,double speed){
        this.baseFare=baseFare;
        this.distance=distance;
        this.distanceFare=distanceFare*distance;
        this.durationFare*=(distance/speed)*60;
    }
    public double totalFare(){
        return baseFare+durationFare+distanceFare;
    }
}
