package org.example;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String team;
    private long salary;
    private POSITION position;

//    public Employee(){//тоже закомментили из-за наличия билдера
//    }

    public Employee(String firstName, String lastName, int age, String team, POSITION position) {
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) { // конструктор с аргументами

        if (age < 18) {
            System.out.println("Incorrect age value");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0) {
            salary = position.minSalary;

        }
        this.salary = salary;
        this.position = position;

    }
//т.к. есть билдер, то сеттеры НЕ нужны и их комментим, их юзали в employee2
//    public void setFirstName(String firstName1) {//если тут и ниже будут одтнаковые значения, то внизу обращаться через this
//        firstName = firstName1;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public void setLastName(String lastName1) {
//        lastName = lastName1;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age1) {
//        age = age1;
//    }

    public String getTeam() {
        return team;
    }

//    public void setTeam(String team1) {
//        team = team1;
//    }

    public long getSalary() {
        return salary;
    }

//    public void setSalary(long salary) {
//        this.salary = salary;
//    }

    public POSITION getPosition() {
        return position;
    }

//    public void setPosition(POSITION position) {
//        this.position = position;
//    }
}

