package DesignPatterns.Flyweight;

public class Developer implements Employee{


    private final String JOB;

    private String skill;

    public Developer() {
        JOB = "is to fix the bug";
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
