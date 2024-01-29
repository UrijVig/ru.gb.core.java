## Домашняя работа к третьему семинару java core.

1. *Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.*  

    [Класс сотрудника](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem03/src/main/java/app/model/Employee.java)  
    
    Данный метод иммитирует унаследованный метод ***compareTo*** от интерфейса ***Comparable***
    ```java
    public int compareTo(Employee o) {
        int thisEmployee = this.getBirthday().getYear() * 365 + this.getBirthday().getMonth() * 30 + this.getBirthday().getDay();
        int oEmployee = o.getBirthday().getYear() * 365 + o.getBirthday().getMonth() * 30 + o.getBirthday().getDay();
        return thisEmployee - oEmployee;
    }
    ```  

    [Класс Main](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem03/src/main/java/app/Main.java)

    Данный метод производит сравнивание объектов на основе полученных данных из вышеописанного метода ***compareTo***
    
    ```java
    private static void comparator(Employee first, Employee second) {
        int dif = first.compareTo(second);
        if (dif < 0) System.out.println(first
                + "\t старше \n" + second);
        else if (dif > 0) System.out.println(first
                + "\t младше \n" + second);
        else System.out.println(first
                    + "\t ровесник \n" + second);
    }
    ```

2. *Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей (использовать instanceof). В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась*  

    [Класс руководителя](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem03/src/main/java/app/model/ex/Supervisor.java)

    Следующий метод производит повышение заработной платы в зависимости от возроста сотрудника, кроме тех случаев, когда сотрудник является руководителем
    ```java
    public static void upSalary(int age, int salary, Employee employee) {
        if (employee.getJobTitle().equals("Supervisor")) return;
        if (age <= employee.getAge()) {
            employee.setSalary(employee.getSalary() + salary);
        }
    }
    ```

[Полный проект с реализацией методов](https://github.com/UrijVig/ru.gb.core.java/tree/main/seminars/sem03)