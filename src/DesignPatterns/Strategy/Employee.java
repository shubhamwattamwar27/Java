package DesignPatterns.Strategy;

public class Employee {

    private String name;
    private Role role;

    public Employee() {
    }

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void promoteRole(Role role)
    {
        this.role = role;
    }

    public String doWork(){
        return this.name + " a " + role.responsibilities();
    }

    public String grade(){
        return this.name + " a " + role.description();
    }
}
