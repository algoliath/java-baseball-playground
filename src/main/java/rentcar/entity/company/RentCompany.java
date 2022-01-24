package rentcar.entity.company;

import rentcar.entity.cars.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    List<Car> rentCars;

    public RentCompany(){
        rentCars = new ArrayList<>();
    }

    public void addCar(Car car){
        rentCars.add(car);
    }

    public String report() {
        StringBuilder res = new StringBuilder();
        for(Car car: rentCars){
            res.append(car);
        }
        return res.toString();
    }

}
