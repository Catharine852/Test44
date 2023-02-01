package org.example;

public class EmployeeBuilderFactory {

    public static final EmployeeBuilderFactory INSTANCE = new EmployeeBuilderFactory();

    private EmployeeBuilderFactory(){
    }

    public AbstractEmployeeBuilder buildEmployeeBuilder() {
        return new Employee.Builder();// или return new Intern.Builder();
//        .team("AQA");//можно еще так
    }

}
