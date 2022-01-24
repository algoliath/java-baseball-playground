package rentcar;

import rentcar.entity.cars.model.Car;
import rentcar.entity.company.RentCompany;

public class RentApp {
    public static void main(String[] args) {
        RentAppConfig appConfig = new RentAppConfig();
        RentCompany company = appConfig.rentCompany();
        company.addCar(appConfig.rentCar("K5", 130));
        company.addCar(appConfig.rentCar("Sonata", 130));
        company.addCar(appConfig.rentCar("Avante", 130));
        System.out.println("company report\n" + company.report());
    }
}
