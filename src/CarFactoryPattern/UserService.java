package CarFactoryPattern;

import java.util.Map;

public class UserService implements Service{
    @Override
    public void serve(Map<String, String> parameters) {
        System.out.println("User Service");

    }
}
