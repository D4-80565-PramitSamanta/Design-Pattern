package BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

// Publisher (Subject)
class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}

// Subscriber (Observer)
interface Subscriber {
    void update(String message);
}

// Concrete Subscriber
class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");

        publisher.attach(subscriber1);
        publisher.attach(subscriber2);

        publisher.notifySubscribers("Hello, World!");

        publisher.detach(subscriber1);

        publisher.notifySubscribers("Another message!");
    }
}
