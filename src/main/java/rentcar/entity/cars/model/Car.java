package rentcar.entity.cars.model;

import rentcar.CarInfo;
import rentcar.utils.MileageInfo;
import rentcar.wrapper.CarName;
import rentcar.wrapper.Distance;
import rentcar.wrapper.Mileage;

public abstract class Car {

    private final Mileage mileage;
    private final CarName carName;
    private final Distance distance;

    public Car(String carName, double distance, CarInfo carInfo) {
        this.carName = new CarName(carName);
        this.distance = new Distance(distance);
        this.mileage = carInfo.getMileage(this.carName); // 정의되지 않은 이름의 자동차 생성 방지
    }

    public abstract double getLitersForDist();

    public Mileage getDistancePerLiter() {
        return mileage;
    }

    public Distance getDistance(){
        return distance;
    }

    @Override
    public String toString() {
        return carName + " : " + (int) getLitersForDist() + "리터\n";
    }
}
