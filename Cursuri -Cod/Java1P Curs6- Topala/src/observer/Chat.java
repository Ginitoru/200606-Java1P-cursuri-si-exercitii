package observer;

import java.util.ArrayList;
import java.util.List;

public class Chat {

    private List<Listener> listeners = new ArrayList<>();


    public void addListener(Listener l){
        listeners.add(l);

    }

    public void notifyListeners(String message){
       listeners.forEach(l -> l.reciveMessage(message));

    }

}
