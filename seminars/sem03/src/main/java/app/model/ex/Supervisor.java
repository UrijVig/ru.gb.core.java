package src.main.java.app.model.ex;

import src.main.java.app.model.Employee;

import java.util.Date;

/**
 * Класс представления руководителя
 */
public class Supervisor extends Employee {

    /**
     * Конструктор для создания экземпляра класса руководителя
     *
     * @param firstName   Имя
     * @param midlName    Фамилия
     * @param lastName    Отчество
     * @param birthday    Дата рождения
     * @param phoneNumber номер телефона
     * @param salary      заработная плата
     */
    public Supervisor(String firstName, String midlName, String lastName, Date birthday, String phoneNumber, int salary) {
        super(firstName, midlName, lastName, birthday, phoneNumber, "Supervisor", salary);
    }

    /**
     * Метод повышения заработной платы в зависимости от указанного возраста сотрудника
     * @param age возраст сотрудника
     * @param salary сумма повышения заработной платы
     * @param employee экземпляр класса сотрудника для рассмотрения кандидатуры на повышения заработной платы
     */
    public static void upSalary(int age, int salary, Employee employee) {
        if (employee.getJobTitle().equals("Supervisor")) return;
        if (age <= employee.getAge()) {

            employee.setSalary(employee.getSalary() + salary);

        }



    }
}
