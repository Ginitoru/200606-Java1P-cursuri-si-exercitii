package files;

import java.util.HashMap;
import java.util.Map;

public class DataBase {



    public DataBase(){

    }




    private static Map<String, User> usersMap = new HashMap<>();

    public static void registeringUser(String username, User user){
        usersMap.put(username, user);
    }

    public static boolean DBLogin(String username, String password){
        if(usersMap.get(username) != null){
            return usersMap.get(username).getPassword().equals(password);
        }
        return false;
    }

    public static Map<String, User> getUsersMap() {
        return usersMap;
    }
}
