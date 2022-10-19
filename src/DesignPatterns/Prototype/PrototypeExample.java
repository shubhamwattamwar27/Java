package DesignPatterns.Prototype;

//The prototype pattern is a creational design pattern.
// DesignPatterns.Prototype patterns are required, when object creation is time consuming,
// and costly operation, so we create objects with the existing object itself.
// One of the best available ways to create an object from existing objects is the clone() method.
public class PrototypeExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Test1");
        bs.loadData();
        System.out.println(bs);

        bs.getBookList().remove(3);
        BookShop bs1 = bs.clone();
        bs.setShopName("Test2");
        System.out.println(bs);


    }


}
