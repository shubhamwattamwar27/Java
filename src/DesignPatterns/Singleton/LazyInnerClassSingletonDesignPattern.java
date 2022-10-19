package DesignPatterns.Singleton;

public class LazyInnerClassSingletonDesignPattern {

    private LazyInnerClassSingletonDesignPattern(){}

    private static class LazyInnerClass {
        private static LazyInnerClassSingletonDesignPattern lazySingletonDesignPattern = new LazyInnerClassSingletonDesignPattern();
    }

    public static synchronized LazyInnerClassSingletonDesignPattern getInstance(){
        return LazyInnerClass.lazySingletonDesignPattern;
    }
}
