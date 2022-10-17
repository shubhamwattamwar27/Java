package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static Map<String,Employee> employeeMap = new HashMap<>();

    public static Employee getEmployee(String type) {
        Employee e = null;
        if (employeeMap.get(type)!=null)
            return employeeMap.get(type);
        else{
            switch (type){
                case "Developer":
                    System.out.println("Developer is created");
                    e = new Developer();
                    break;

                case "Tester" :
                    System.out.println("Tester is created");
                    e = new Tester();
                    break;

                default:
                    System.out.println("No such type of employee present");

            }
            employeeMap.put(type,e);
        }

        return e;
    }
}
