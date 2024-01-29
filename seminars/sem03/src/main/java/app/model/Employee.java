package src.main.java.app.model;

import java.util.Date;

public class Employee {
    private final String firstName;
    private final String midlName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final String jobTitle;
    private int salary;
    private final Date birthday;

    public Employee(String firstName, String midlName, String lastName, Date birthday,
                    String phoneNumber, String jobTitle, int salary) {
        this.firstName = firstName;
        this.midlName = midlName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.age = (new Date()).getYear() - birthday.getYear();
    }


    @Override
    public String toString() {
        return String.format("Employee: firstName = %s, midlName = %s, lastName = %s, " +
                        "age = %d, phoneNumber = %s, jobTitle = %s, salary = %d.\n"
                , firstName, midlName, lastName, age, phoneNumber, jobTitle, salary);
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int compareTo(Employee o) {
        int thisEmployee = this.getBirthday().getYear() * 365 + this.getBirthday().getMonth() * 30 + this.getBirthday().getDay();
        int oEmployee = o.getBirthday().getYear() * 365 + o.getBirthday().getMonth() * 30 + o.getBirthday().getDay();
        return thisEmployee - oEmployee;
    }
}
