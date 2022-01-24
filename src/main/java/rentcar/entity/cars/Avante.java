package rentcar.entity.cars;

import rentcar.CarInfo;
import rentcar.wrapper.Mileage;
import rentcar.entity.cars.model.Car;

public class Avante extends Car {

    public Avante(double distance, CarInfo carInfo){
        super("Avante", distance, carInfo);
    }

    @Override
    public double getLitersForDist() {
        Mileage mileage = getDistancePerLiter();
        return mileage.getChargeQuantity(getDistance());
    }
}
