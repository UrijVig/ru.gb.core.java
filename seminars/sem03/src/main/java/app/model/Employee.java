package src.main.java.app.model;

import java.util.Date;

/**
 * Клас представления сотрудников
 */
public class Employee {
    private final String firstName;
    private final String midlName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final String jobTitle;
    private int salary;
    private final Date birthday;

    /**
     * Конструктор для создания экземпляра класса сотрудника
     *
     * @param firstName   Имя
     * @param midlName    Фамилия
     * @param lastName    Отчество
     * @param birthday    Дата рождения
     * @param phoneNumber номер телефона
     * @param jobTitle    должность
     * @param salary      заработная плата
     */
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


    /**
     * Метод для представления класса в строчном виде
     *
     * @return строку с полями класса
     */
    @Override
    public String toString() {
        return String.format("Employee: firstName = %s, midlName = %s, lastName = %s, " +
                        "age = %d, phoneNumber = %s, jobTitle = %s, salary = %d.\n"
                , firstName, midlName, lastName, age, phoneNumber, jobTitle, salary);
    }

    /**
     * Метод для получения возраста сотрудника
     *
     * @return возраст сотрудника
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для редактирования уровня заработной платы
     *
     * @param salary текущая заработная плата
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Метод для получения уровня текущей заработной платы
     *
     * @return уровень заработной платы
     */
    public int getSalary() {
        return salary;
    }

    /**
     * метод получения даты рождения сотрудника
     *
     * @return дата рождения сотрудника
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Метод получения должности сотрудника
     *
     * @return должность сотрудника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Метод сравнения сотрудников по точному возрасту
     *
     * @param o экземпляр класса сотрудника для сравнения с текущим экземпляром класса
     * @return разницу в возрасте в днях
     */
    public int compareTo(Employee o) {
        int thisEmployee = this.getBirthday().getYear() * 365 + this.getBirthday().getMonth() * 30 + this.getBirthday().getDay();
        int oEmployee = o.getBirthday().getYear() * 365 + o.getBirthday().getMonth() * 30 + o.getBirthday().getDay();
        return thisEmployee - oEmployee;
    }
}
