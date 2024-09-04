package dhanu.study.designpatterrns.creational.singleton;

public class StaticBlockSingleton {

    private static  StaticBlockSingleton instance;

    private StaticBlockSingleton() {

    }

    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e){
            throw new RuntimeException("Exception", e);
        }
    }

    public StaticBlockSingleton getInstance(){
        return instance;
    }
}
