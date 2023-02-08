package CarFactoryPattern;

import java.util.Map;

public class DealService implements Service {
    @Override
    public void serve(Map<String, String> parameters) {
        System.out.println("Deal Service");
    }
}
