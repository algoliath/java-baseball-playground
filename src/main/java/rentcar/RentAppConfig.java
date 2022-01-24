package rentcar;

import rentcar.entity.cars.Avante;
import rentcar.entity.cars.K5;
import rentcar.entity.cars.Sonata;
import rentcar.entity.cars.model.Car;
import rentcar.entity.company.RentCompany;

public class RentAppConfig {

    public CarInfo carInfo(){
        return CarInfo.getInstance();
    }

    public RentCompany rentCompany(){
        return new RentCompany();
    }

    public Car rentCar(String modelName, double dist){
        switch (modelName){
            case "K5" : return new K5(dist, carInfo());
            case "Sonata" : return new Sonata(dist, carInfo());
            case "Avante" : return new Avante(dist, carInfo());
        }
        return null;
    }

}
