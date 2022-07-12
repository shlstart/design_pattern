import java.util.ArrayList;

/**
 * Author: shlstart
 * Create: 2022-07-10
 */
public class MainTest01 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello github");
        System.out.println("hello git hot-fix");
        System.out.println("hello git hot-fix test");
    }
}




abstract class Subject {

    // a collections of observers
    protected ArrayList<Observer> observers = new ArrayList<>();

    // add an observer to list
    public void attach (Observer observer) {
        observers.add(observer);
    }

    // remove an observer from list
    public void detach (Observer observer) {
        observers.remove(observer);
    }
    // let its subclass to implement this method to notify its ally
    public abstract void notifyObserver();
}

class ConcreteMainTest01 extends Subject {

    // notify its ally
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }

    }
}


interface Observer {
    public void update();
}

class ConcreteObserver implements Observer {

    @Override
    public void update() {

    }
}