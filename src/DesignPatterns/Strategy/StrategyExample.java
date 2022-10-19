package DesignPatterns.Strategy;

public class StrategyExample {

    public static void main(String[] args) {
        Employee shubham = new Employee("Shubham",new Consultant());

        Employee ram = new Employee("Ram", new PrincipleConsultant());

        System.out.println("Before Promotion");

        System.out.println(ram.doWork());
        System.out.println(shubham.doWork());

        System.out.println(ram.grade());
        System.out.println(shubham.grade());

        System.out.println("After Promotion");

        shubham.promoteRole(new SeniorConsultant());

        System.out.println(ram.doWork());
        System.out.println(shubham.doWork());

        System.out.println(ram.grade());
        System.out.println(shubham.grade());



    }
}
