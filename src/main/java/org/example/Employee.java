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

    public static class Builder {
        //    public EmployeeBuilder(){ //этот конструктор можно не писать
//    }
        private String firstName;
        private String lastName;
        private int age;
        private String team;
        private long salary;
        private POSITION position;

        public Employee.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Employee.Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee.Builder team(String team) {
            this.team = team;
            return this;
        }

        public Employee.Builder age(int age) {
            this.age = age;
            return this;
        }

        public Employee.Builder salary(long salary) {
            this.salary = salary;
            return this;
        }

        public Employee.Builder position(POSITION position) {
            this.position = position;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, age, team, salary, position);
        }
    }

}

