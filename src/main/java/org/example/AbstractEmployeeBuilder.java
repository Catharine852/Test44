package org.example;

public abstract class AbstractEmployeeBuilder {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String team;
    protected long salary;
    protected POSITION position;

    public AbstractEmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AbstractEmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AbstractEmployeeBuilder team(String team) {
        this.team = team;
        return this;
    }

    public AbstractEmployeeBuilder age(int age) {
        this.age = age;
        return this;
    }

    public AbstractEmployeeBuilder salary(long salary) {
        this.salary = salary;
        return this;
    }

    public AbstractEmployeeBuilder position(POSITION position) {
        this.position = position;
        return this;
    }
    public abstract Employee build();
}
