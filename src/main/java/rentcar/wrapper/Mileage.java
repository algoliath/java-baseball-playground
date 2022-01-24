package rentcar.wrapper;

public class Mileage {
    double mileage;
    public Mileage(double mileage){
        this.mileage = mileage;
    }

    public double getChargeQuantity(Distance distance) {
        return distance.getLiters(mileage);
    }

    @Override
    public String toString() {
        return (int) mileage+"";
    }
}
