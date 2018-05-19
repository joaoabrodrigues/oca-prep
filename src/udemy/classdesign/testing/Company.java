package udemy.classdesign.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO -> Plain Old Java Object
public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorted(){
        System.out.println("companyName = " + name);
        Collections.sort(employees);
        System.out.println("sorted = " + employees);
    }

    public void setName(String name) {
        if (name == null)
            System.out.println("name can't be null");
        else
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String name) {
        if (name == null || name.isEmpty())
            System.out.println("can't add null or empty employee");
        else
            employees.add(name);
    }

}