package DesignPatterns.Observer;

public class YouTube {
    public static void main(String[] args) {
        Channel test = new Channel();

        Subscriber subscriber= new Subscriber("Shubham");
        Subscriber subscriber1= new Subscriber("Shubham1");
        Subscriber subscriber2= new Subscriber("Shubham2");
        Subscriber subscriber3= new Subscriber("Shubham3");
        Subscriber subscriber4= new Subscriber("Shubham4");

        test.subscribe(subscriber);
        test.subscribe(subscriber1);
        test.subscribe(subscriber2);
        test.subscribe(subscriber3);
        test.subscribe(subscriber4);

        subscriber.subscribeChannel(test);
        subscriber1.subscribeChannel(test);
        subscriber2.subscribeChannel(test);
        subscriber3.subscribeChannel(test);
        subscriber4.subscribeChannel(test);

        test.unsubscribe(subscriber2);
        test.upload("Test video");
    }
}
