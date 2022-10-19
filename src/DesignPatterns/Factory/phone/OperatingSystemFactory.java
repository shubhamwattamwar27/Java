package DesignPatterns.Factory.phone;

public class OperatingSystemFactory {

    public OS getInstance(String str){

        if(str.equals("android"))
            return new Android();
        else if(str.equals("iso"))
            return new IOS();
        else
            return new Windows();
    }
}
