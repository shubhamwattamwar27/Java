package DesignPatterns.Factory;

import DesignPatterns.Factory.phone.OS;
import DesignPatterns.Factory.phone.OperatingSystemFactory;

//The factory design pattern is used when we have a superclass with multiple sub-classes
// and based on input, we need to return one of the sub-class.
// This pattern takes out the responsibility of the instantiation of a class from the client program
// to the factory class
public class FactoryExample {

    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("android");
        obj.spec();
        OS obj1 = osf.getInstance("iso");
        obj1.spec();
    }

}
