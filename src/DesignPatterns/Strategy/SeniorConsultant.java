package DesignPatterns.Strategy;

public class SeniorConsultant implements Role {
    @Override
    public String description() {
        return SeniorConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Review Code";
    }
}
