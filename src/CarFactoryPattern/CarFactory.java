package CarFactoryPattern;

import java.util.Map;
import java.util.spi.AbstractResourceBundleProvider;

public class CarFactory {
    public static Car buildCar(CarType type, Map<String,String> params)
    {/*
    .model = model;
        this.number = number;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }*/
        switch (type) {
            case SEDAN:
                return new SedanCar(params.get("model"),
                        params.get("number"),
                        params.get("color"),
                        Double.valueOf(params.get("maxSpeed")));

            case SMALL:
                return new SmallCar(params.get("model"),
                        params.get("number"),
                        params.get("color"),
                        Double.valueOf(params.get("maxSpeed")));
            case SPORT:
                return new SportCar(params.get("model"),
                        params.get("number"),
                        params.get("color"),
                        Double.valueOf(params.get("maxSpeed")) );
            default: throw new IllegalArgumentException("неправильный тип машины" + type);

        }
    }

}
