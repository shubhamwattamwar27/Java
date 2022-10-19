package DesignPatterns.Strategy;

public class PrincipleConsultant implements Role {
    @Override
    public String description() {
        return PrincipleConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Mark for delivery";
    }
}
