package Singleton;

public class LazySingletonDesignPatternWithClone extends MyClone {

    private static LazySingletonDesignPatternWithClone lazySingletonDesignPattern;

    private LazySingletonDesignPatternWithClone(){}

    public static synchronized LazySingletonDesignPatternWithClone getInstance(){
        if(lazySingletonDesignPattern == null)
            lazySingletonDesignPattern = new LazySingletonDesignPatternWithClone(); // 2 objects will get created it leads to performance issue
        return lazySingletonDesignPattern;
    }
}
