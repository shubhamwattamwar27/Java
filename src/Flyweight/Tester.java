package Flyweight;

public class Tester implements Employee {

    private final String JOB;
    private String skill;

    public Tester() {
        JOB = "is test the product";
    }

    @Override
    public void assignSkills(String skills) {
        this.skill = skills;
    }

    @Override
    public void task() {
        System.out.println(" Developer with skills = "+ skill + " with job = " + JOB);
    }
}
