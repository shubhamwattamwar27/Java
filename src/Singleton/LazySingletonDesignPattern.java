package Singleton;

public class LazySingletonDesignPattern {

    private static LazySingletonDesignPattern lazySingletonDesignPattern;

    private LazySingletonDesignPattern(){}

    public static synchronized LazySingletonDesignPattern getInstance(){
        if(lazySingletonDesignPattern == null)
            lazySingletonDesignPattern = new LazySingletonDesignPattern(); // 2 objects will get created it leads to performance issue
        return lazySingletonDesignPattern;
    }
}
