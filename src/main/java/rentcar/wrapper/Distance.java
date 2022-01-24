package rentcar.wrapper;

public class Distance {

    private final double distance;

    public Distance(double distance){
            this.distance = distance;
        }

        public double getLiters(double mileage){
            return distance/mileage;
        }

        public String toString(){
            return distance+"";
    }
}
