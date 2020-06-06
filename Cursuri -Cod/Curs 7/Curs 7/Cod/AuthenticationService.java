package BileteTrenGUI;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {

    private static Map<String, String> usernamePasswordMap = new HashMap<>();

    public static boolean login(String username, String password) {
        if (usernamePasswordMap.get(username) != null) {
            return usernamePasswordMap.get(username).equals(password);
        }
        return false;
    }


    public static void register(String username, String password) {
        usernamePasswordMap.put(username, password);
    }
}
