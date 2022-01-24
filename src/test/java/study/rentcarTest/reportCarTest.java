package study.rentcarTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rentcar.CarInfo;
import rentcar.entity.cars.Avante;
import rentcar.entity.cars.K5;
import rentcar.entity.cars.Sonata;
import rentcar.entity.company.RentCompany;
import rentcar.utils.MileageInfo;

import static org.assertj.core.api.Assertions.*;

public class reportCarTest {

    @Test
    void reportSingleCars(){
         String NEWLINE = "\n";
         RentCompany rentCompany = new RentCompany();
         rentCompany.addCar(new K5(130, CarInfo.getInstance()));
         assertThat(rentCompany.report()).isEqualTo("K5 : 10" + NEWLINE);
    }

    @Test
    void reportMultipleCars(){
        String NEWLINE = "\n";
        RentCompany rentCompany = new RentCompany();
        rentCompany.addCar(new K5(130, CarInfo.getInstance()));
        rentCompany.addCar(new Sonata(120, CarInfo.getInstance()));;
        rentCompany.addCar(new Avante(120, CarInfo.getInstance()));
        assertThat(rentCompany.report()).isEqualTo(
                "K5 : 10리터" + NEWLINE +
                "Sonata : 12리터" + NEWLINE +
                "Avante : 8리터" + NEWLINE);
    }
}

