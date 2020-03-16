package ru.job4j.loop;

/**
 *1 не является простым числом и в цикле не будет вычислений
 *поэтому сбросим флаг принудительно
 *хотя можно было бы заменить в 5 на boolean prime = number > 1;
 */
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        if (number == 1) {
            prime = false;
        }
        return prime;
    }
}