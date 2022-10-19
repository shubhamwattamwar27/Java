package DesignPatterns.Singleton;

public class DoubleCheckLazySingletonDesignPattern {

    private static DoubleCheckLazySingletonDesignPattern doubleCheckLazySingletonDesignPattern;

    private DoubleCheckLazySingletonDesignPattern(){}

    public static  DoubleCheckLazySingletonDesignPattern getInstance(){
        if(doubleCheckLazySingletonDesignPattern == null)
            synchronized(DoubleCheckLazySingletonDesignPattern.class) {
                if (doubleCheckLazySingletonDesignPattern == null) {
                    doubleCheckLazySingletonDesignPattern = new DoubleCheckLazySingletonDesignPattern();
                }
            }
        return doubleCheckLazySingletonDesignPattern;
    }
}
