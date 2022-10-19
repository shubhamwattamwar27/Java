package DesignPatterns.Singleton;

public class LazySingletonDesignPatternWithOverridingConstructor extends MyClone {

    private static LazySingletonDesignPatternWithOverridingConstructor lazySingletonDesignPattern;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private LazySingletonDesignPatternWithOverridingConstructor(){
        if(lazySingletonDesignPattern != null)
            throw new IllegalStateException("Object can't be created, because it already created");
    }

    public static synchronized LazySingletonDesignPatternWithOverridingConstructor getInstance(){
        if(lazySingletonDesignPattern == null)
            lazySingletonDesignPattern = new LazySingletonDesignPatternWithOverridingConstructor(); // 2 objects will get created it leads to performance issue
        return lazySingletonDesignPattern;
    }
}
