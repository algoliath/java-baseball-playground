package rentcar.entity.cars;

import rentcar.CarInfo;
import rentcar.wrapper.Mileage;
import rentcar.entity.cars.model.Car;

public class Sonata extends Car {

    public Sonata(double distance, CarInfo carInfo) {
        super("Sonata", distance, carInfo);
    }

    @Override
    public double getLitersForDist() {
        Mileage mileage = getDistancePerLiter();
        return mileage.getChargeQuantity(getDistance());
    }

}
