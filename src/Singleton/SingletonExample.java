package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonExample {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {

        EagerSingletonDesignPattern eagerSingletonDesignPattern = EagerSingletonDesignPattern.getInstance();
        System.out.println("Hash Code of 1st EagerSingletonDesignPattern = "+eagerSingletonDesignPattern.hashCode());
        System.out.println("Hash Code of 2nd EagerSingletonDesignPattern = "+EagerSingletonDesignPattern.getInstance().hashCode());

        LazySingletonDesignPattern lazySingletonDesignPattern = LazySingletonDesignPattern.getInstance();
        System.out.println("Hash Code of 1st LazySingletonDesignPattern = "+lazySingletonDesignPattern.hashCode());
        System.out.println("Hash Code of 2nd LazySingletonDesignPattern = "+LazySingletonDesignPattern.getInstance().hashCode());

        DoubleCheckLazySingletonDesignPattern doubleCheckLazySingletonDesignPattern = DoubleCheckLazySingletonDesignPattern.getInstance();
        System.out.println("Hash Code of 1st DoubleCheckLazySingletonDesignPattern = "+doubleCheckLazySingletonDesignPattern.hashCode());
        System.out.println("Hash Code of 2nd DoubleCheckLazySingletonDesignPattern = "+DoubleCheckLazySingletonDesignPattern.getInstance().hashCode());

        LazyInnerClassSingletonDesignPattern lazyInnerClassSingletonDesignPattern = LazyInnerClassSingletonDesignPattern.getInstance();
        System.out.println("Hash Code of 1st LazyInnerClassSingletonDesignPattern = "+lazyInnerClassSingletonDesignPattern.hashCode());
        System.out.println("Hash Code of 2nd LazyInnerClassSingletonDesignPattern = "+LazyInnerClassSingletonDesignPattern.getInstance().hashCode());

        System.out.println("Cloning example =");

        LazySingletonDesignPatternWithClone lazySingletonDesignPatternWithClone = LazySingletonDesignPatternWithClone.getInstance();
        System.out.println("Hash Code of 1st LazySingletonDesignPatternWithClone with clone = "+lazySingletonDesignPatternWithClone.hashCode());
        System.out.println("Hash Code of 2nd LazySingletonDesignPatternWithClone with clone = "+lazySingletonDesignPatternWithClone.clone().hashCode());

        LazySingletonDesignPatternWithOverridingClone lazySingletonDesignPatternWithOverridingClone = LazySingletonDesignPatternWithOverridingClone.getInstance();
        System.out.println("Hash Code of 1st LazySingletonDesignPatternWithOverridingClone with clone = "+lazySingletonDesignPatternWithOverridingClone.hashCode());
        //System.out.println("Hash Code of 2nd LazySingletonDesignPatternWithOverridingClone with clone = "+lazySingletonDesignPatternWithOverridingClone.clone().hashCode());

        LazySingletonDesignPatternWithOverridingClone reflectionExample1 = null;

        Constructor[] constructors1 = LazySingletonDesignPatternWithOverridingClone.class.getDeclaredConstructors();
        for (Constructor c : constructors1){
            c.setAccessible(true);
            reflectionExample1 = (LazySingletonDesignPatternWithOverridingClone) c.newInstance();
        }
        System.out.println("Hash Code of 3rd LazySingletonDesignPatternWithOverridingClone with Reflextion API = "+reflectionExample1.hashCode());

        LazySingletonDesignPatternWithOverridingConstructor lazySingletonDesignPatternWithOverridingConstructor = LazySingletonDesignPatternWithOverridingConstructor.getInstance();
        System.out.println("Hash Code of 1st LazySingletonDesignPatternWithOverridingConstructor with Overriding Constructor = "+lazySingletonDesignPatternWithOverridingConstructor.hashCode());

        LazySingletonDesignPatternWithOverridingConstructor reflectionExample = null;

        Constructor[] constructors = LazySingletonDesignPatternWithOverridingConstructor.class.getDeclaredConstructors();
        for (Constructor c : constructors){
            c.setAccessible(true);
            reflectionExample = (LazySingletonDesignPatternWithOverridingConstructor) c.newInstance();
        }


        //System.out.println("Hash Code of 2nd LazySingletonDesignPatternWithOverridingConstructor with Overriding Constructor = "+reflectionExample.hashCode());

    }
}
