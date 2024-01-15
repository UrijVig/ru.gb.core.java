package ru.gb.jcore.model;
/**
 * Класс модели пользователя
 */
public class UserModel {

    /**
     * Конструктор по умолчанию
     */
    public UserModel() {

    }

    /**
     * Метод для выполнения операции сложения
     *
     * @param numberOne первое число
     * @param numberTwo второе число
     * @return результат сложения
     */
    public double addition(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    /**
     * Метод для выполнения операции вычитания
     *
     * @param numberOne первое число
     * @param numberTwo второе число
     * @return результат вычитания
     */
    public double subtraction(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    /**
     * Метод для выполнения операции деления
     *
     * @param numberOne первое число
     * @param numberTwo второе число
     * @return результат деления
     */
    public double division(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    /**
     * Метод для выполнения операции умножения
     *
     * @param numberOne первое число
     * @param numberTwo второе число
     * @return результат умножения
     */
    public double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
}