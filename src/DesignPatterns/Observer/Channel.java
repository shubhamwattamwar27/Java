package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observer {

    private List<Subscriber> subscribersList = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber){
        subscribersList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribersList.remove(subscriber);
    }

    public void notifySubscriber(){
        for(Subscriber sub : subscribersList)
            sub.update();
    }

    public void upload(String title)
    {
        this.title = title;
        notifySubscriber();
    }
}
