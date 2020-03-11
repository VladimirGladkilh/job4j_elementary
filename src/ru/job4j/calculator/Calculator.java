package ru.job4j.calculator;

/**
 * Class Calculator для сложения двух чисел
 * @author Gladkih
 * @since 11/03/2020
 * @version 1.0
 */
public class Calculator {
    /**
     * Сложение
     * @param first первое слагаемое
     * @param second второе слагаемое
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }

}
