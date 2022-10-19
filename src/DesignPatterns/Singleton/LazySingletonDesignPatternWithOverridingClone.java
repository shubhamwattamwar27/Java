package DesignPatterns.Singleton;

public class LazySingletonDesignPatternWithOverridingClone extends MyClone {

    private static LazySingletonDesignPatternWithOverridingClone lazySingletonDesignPattern;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private LazySingletonDesignPatternWithOverridingClone(){}

    public static synchronized LazySingletonDesignPatternWithOverridingClone getInstance(){
        if(lazySingletonDesignPattern == null)
            lazySingletonDesignPattern = new LazySingletonDesignPatternWithOverridingClone(); // 2 objects will get created it leads to performance issue
        return lazySingletonDesignPattern;
    }
}
