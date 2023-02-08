package CarFactoryPattern;

import java.util.Map;

public class ProductService implements Service {
    @Override
    public void serve(Map<String, String> parameters) {
        System.out.println("Product service");
    }
}
