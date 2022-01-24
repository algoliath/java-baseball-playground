package rentcar.entity.cars;

import rentcar.CarInfo;
import rentcar.wrapper.Mileage;
import rentcar.entity.cars.model.Car;

public class K5 extends Car {

    public K5(double distance, CarInfo carInfo){
         super("K5", distance, carInfo);
    }

    @Override
    public double getLitersForDist() {
        Mileage mileage = getDistancePerLiter();
        return mileage.getChargeQuantity(getDistance());
    }

}
