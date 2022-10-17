package Builder;

public class BuilderExample {

    public static void main(String[] args) {
        Phone phone = new Phone("Android",8,"Snapdragon",2000);

        System.out.println(phone);

        Phone phone1 = new PhoneBuilder().setBattery(5000).setOs("IOS").setProcessor("Chip").getPhone();

        System.out.println(phone1);

    }

}
