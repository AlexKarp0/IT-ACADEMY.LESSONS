package CarFactoryPattern;

import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        Map<String,String> parameter = new HashMap<>();
        parameter.put("Model","Mazda");

        ServiceFactory.getService("user").serve(null);
    }
}
