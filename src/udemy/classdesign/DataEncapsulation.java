package udemy.classdesign;

import udemy.classdesign.testing.Company;

public class DataEncapsulation {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("MyCompany");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null);
        company.addEmployee("");

        company.printSorted();

        //company.name = null;
        //company.printSorted();

        //company.employees = null;
        //company.printSorted();
    }
}
