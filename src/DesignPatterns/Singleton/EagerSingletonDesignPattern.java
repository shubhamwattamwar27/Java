package DesignPatterns.Singleton;

public class EagerSingletonDesignPattern {

    private static EagerSingletonDesignPattern eagerSingletonDesignPattern = new EagerSingletonDesignPattern();

    private EagerSingletonDesignPattern(){}

    public static EagerSingletonDesignPattern getInstance(){
        return eagerSingletonDesignPattern;
    }
}
