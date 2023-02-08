package CarFactoryPattern;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {
    private static Map<String, Service> map = new HashMap<>();
    static {
        map.put("user",new UserService());
        map.put("deal",new DealService());
        map.put("product",new ProductService());
    }
    public static Service getService(String type){
        return map.get(type);
    }
}
