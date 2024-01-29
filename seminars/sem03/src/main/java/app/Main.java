package src.main.java.app;

import src.main.java.app.model.Employee;
import src.main.java.app.model.ex.Supervisor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Основной клас программы
 */
public class Main {
    /**
     * Точка входа в приложение
     * @param args системный параметр
     */
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = getEmployees(); //создание списка сотрудников
        System.out.println(arrayList);

        System.out.println("Средний возраст: " + getMidlAge(arrayList));
        System.out.println("Средний заработок: " + getMidlSalary(arrayList));
        comparator(arrayList.get(0), arrayList.get(1));
        arrayList.add(new Supervisor("Head", "Pet", "Work",
                new Date(73, Calendar.SEPTEMBER, 16), "89652144589", 45896)); // Добавление руководителя в список сотрудников
        for (Employee employee : arrayList) {
            Supervisor.upSalary(40, 50000, employee);
        }
        System.out.println(arrayList);
    }

    /**
     * Метод для отображения отношения сотрудников по возрасту
     * @param first первый стравниваемый сотрудник
     * @param second второй сравниваемый сотрудник
     */
    private static void comparator(Employee first, Employee second) {
        int dif = first.compareTo(second);
        if (dif < 0) System.out.println(first
                + "\t старше \n" + second);
        else if (dif > 0) System.out.println(first
                + "\t младше \n" + second);
        else System.out.println(first
                    + "\t ровесник \n" + second);
    }

    /**
     * Метод для подсчёта среднего возраста сотрудников
     * @param lst список сотрудников
     * @return средний возраст
     */
    private static double getMidlAge(ArrayList<Employee> lst) {
        int sumAge = 0;
        for (Employee employee : lst) {
            sumAge += employee.getAge();
        }
        return (double) sumAge / lst.size();
    }

    /**
     * Метод для подсчёта среднего заработка
     * @param lst список сотрудников
     * @return средний заработок сотрудников
     */
    private static double getMidlSalary(ArrayList<Employee> lst) {
        int sumSalary = 0;
        for (Employee employee : lst) {
            sumSalary += employee.getSalary();
        }
        return (double) sumSalary / lst.size();
    }

    /**
     * Метод для создания списка сотрудников
     * @return список сотрудников
     */
    private static ArrayList<Employee> getEmployees() {
        Employee employee1 = new Employee("Serge", "Peterson", "Mark",
                new Date(89, Calendar.JUNE, 16), "89652144589", "Professor", 45896);
        Employee employee2 = new Employee("Mark", "Griffin", "Curl",
                new Date(86, Calendar.JUNE, 16), "89652144589", "Bug-alter", 45896);
        Employee employee3 = new Employee("Robert", "Gilroy", "Karl",
                new Date(77, Calendar.JUNE, 16), "89652144589", "Topology", 45896);
        Employee employee4 = new Employee("Patrik", "Melony", "Greg",
                new Date(79, Calendar.JUNE, 16), "89652144589", "Secretary", 45896);
        Employee employee5 = new Employee("Offer", "Fil", "Drag",
                new Date(90, Calendar.JUNE, 16), "89652144589", "Security", 45896);

        return new ArrayList<>
                (List.of(new Employee[]{employee1, employee2, employee3, employee4, employee5}));
    }
}
