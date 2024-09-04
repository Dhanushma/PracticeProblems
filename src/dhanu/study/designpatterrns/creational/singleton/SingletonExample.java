package dhanu.study.designpatterrns.creational.singleton;


//Eager Initialization
public class SingletonExample {

    private static final SingletonExample instance = new SingletonExample();

    private SingletonExample() {

    }

    public static SingletonExample getInstance(){
        return instance;
    }
}
