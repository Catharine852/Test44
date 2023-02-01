package org.example;

public class Runner {
    public static void main(String[] args) {
        var employee1 = new Employee("Sasha", "Petrov", 30, "AQA", POSITION.JUNIOR);

//        System.out.println(employee1.getFirstName());
//        employee1.setFirstName("new first name");
//        System.out.println(employee1.getFirstName());
//        System.out.println("**************\n");

//        var employee2 = new Employee();
//        employee2.setFirstName("Petr");
//        employee2.setLastName("Borisov");
//        employee2.setAge(31);
//        employee2.setTeam("Dev");
//        employee2.setPosition(POSITION.MIDDLE);

//        System.out.println(employee2.getLastName());
//        System.out.println(employee2.getAge());
//        System.out.println(employee2.getPosition());
//        System.out.println("**************\n");

        var employee3 = new Employee.Builder()
                .firstName("Anna")
                .lastName("Petrova")
                .age(26)
                .team("QA")
                .position(POSITION.JUNIOR)
                .salary(15000)
                .build();
        System.out.println(employee3.getFirstName());
        System.out.println(employee3.getLastName());
        System.out.println(employee3.getAge());
        System.out.println(employee3.getPosition());
        System.out.println("**************\n");

//        var instance : Singleton = Singleton.getInstance();//-такая запись не работает ???
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(employee1==employee3); // тут будет false, т.к. объекты разные
        System.out.println(singleton1==singleton2); // а тут true, т.к. у Singleton всего 1 объект
        System.out.println("**************\n");

//        var employee4 = new EmployeeBuilderFactory().buildEmployeeBuilder()//эта запись была до INSTANCE
        var employee4 =  EmployeeBuilderFactory.INSTANCE.buildEmployeeBuilder()

                .firstName("Intern")
                .lastName("Intern")
                .age(29)
                .team("QA")
                .position(POSITION.JUNIOR)
                .salary(6000)
                .build();
        System.out.println(employee4.getFirstName());
        System.out.println(employee4.getLastName());
        System.out.println(employee4.getAge());
        System.out.println(employee4.getPosition());
        System.out.println(employee4.isIntern());
        System.out.println("**************\n");

        var employee5 = EmployeeBuilderFactory.INSTANCE.buildEmployeeBuilder()
                .firstName("Intern2")
                .lastName("Intern2")
                .age(31)
                .team("QA")
                .position(POSITION.JUNIOR)
                .salary(8000)
                .build();
        System.out.println(employee5.getFirstName());
        System.out.println(employee5.getLastName());
        System.out.println(employee5.getAge());
        System.out.println(employee5.getPosition());
        System.out.println(employee5.isIntern());
        System.out.println("**************\n");

    }
}