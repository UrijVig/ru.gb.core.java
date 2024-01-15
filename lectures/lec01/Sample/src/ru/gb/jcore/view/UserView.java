package ru.gb.jcore.view;

import ru.gb.jcore.model.UserModel;

import java.util.Scanner;

/**
 * Класс для корректного обмена информацией между пользователем и программой
 */
public class UserView {

    /**
     * Конструктор по умолчанию
     */
    public UserView() {

    }

    /**
     * Метод для старта приложения
     */
    public void run() {
        String operation;
        Scanner scanner = new Scanner(System.in);
        UserModel userModel = new UserModel();
        double result, numberOne, numberTwo;
        while (true) {
            System.out.println("Введите операцию:" +
                    "\n\t\t\"+\" сложеные" +
                    "\n\t\t\"-\" вычитание" +
                    "\n\t\t\"/\" деление" +
                    "\n\t\t\"*\" умножение" +
                    "\n\t\t\"exit\" завершить работу");
//            try {
//            while (scanner.hasNextLine()) {
                operation = scanner.nextLine();
                if (operation.equals("+") ||
                        operation.equals("-") ||
                        operation.equals("/") ||
                        operation.equals("*")) {
                    numberOne = getDouble(scanner, "Введите первое число: ");
                    numberTwo = getDouble(scanner, "Введите второе число: ");
                    switch (operation) {
                        case "+":
                            result = userModel.addition(numberOne, numberTwo);
                            break;
                        case "-":
                            result = userModel.subtraction(numberOne, numberTwo);
                            break;
                        case "/":
                            while (numberTwo == 0) {
                                System.out.println("Деление на ноль невозможно!");
                                numberTwo = getDouble(scanner, "Введите корректное число: ");
                            }
                            result = userModel.division(numberOne, numberTwo);
                            break;
                        case "*":
                            result = userModel.multiplication(numberOne, numberTwo);
                            break;
                        default:
                            scanner.close();
                            return;
                    }
                    System.out.printf("%.2f %s %.2f = %.2f \n", numberOne, operation, numberTwo, result);
                } else if (operation.equals("exit")) {
                    scanner.close();
                    return;
                } else {
                    System.out.println("Выполнение данной операции не предусмотренно! ");
                }
//            } catch (RuntimeException e){
//                System.out.println("Что-то пошл оне так!");
//                scanner.close();
//                return;
//            }
//            }
        }
    }

    /**
     * Метод для Получения данных в виде числа
     *
     * @param scanner сканер для чтения ввода
     * @param text    текст запроса (приглашение ко вводу)
     * @return введённое число
     */
    private double getDouble(Scanner scanner, String text) {
        Double number;
        while (true) {
            System.out.println(text);
            number = isDoubel(scanner.next());
            if (number != null) {
                return number;
            }
            System.out.println("Введены некорректные данные! ");
        }
    }

    /**
     * Метод для проверки корректности вводимых данных
     *
     * @param data введённые данные
     * @return число, при корректном вводе, иначе null
     */
    private Double isDoubel(String data) {
        try {
            return Double.parseDouble(data);
        } catch (RuntimeException e) {
            return null;
        }
    }
}