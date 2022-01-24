package rentcar.utils;

import rentcar.wrapper.CarName;
import rentcar.wrapper.Mileage;

import java.util.HashMap;

public class MileageInfo {

    static HashMap<CarName, Mileage> info = new HashMap<>();

    public static void setMileage(){
        info.put(new CarName("K5"), new Mileage(13));
        info.put(new CarName("Sonata"), new Mileage(10));
        info.put(new CarName("Avante"), new Mileage(15));
    }

    public static Mileage getMileage(CarName carName){
        if(!info.containsKey(carName)){
            throw new IllegalArgumentException("자동차 모델은 K5, Avante, Sonata 중 하나여야 합니다");
        }
        return info.get(carName);
    }

}
