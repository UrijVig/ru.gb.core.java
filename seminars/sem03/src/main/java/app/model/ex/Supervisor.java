package src.main.java.app.model.ex;

import src.main.java.app.model.Employee;

import java.util.Date;

public class Supervisor extends Employee {

    public Supervisor(String firstName, String midlName, String lastName, Date birthday, String phoneNumber, int salary) {
        super(firstName, midlName, lastName, birthday, phoneNumber, "Supervisor", salary);
    }

    public static void upSalary(int age, int salary, Employee employee) {
        if (employee.getJobTitle().equals("Supervisor")) return;
        if (age <= employee.getAge()) {

            employee.setSalary(employee.getSalary() + salary);

        }



    }
}
