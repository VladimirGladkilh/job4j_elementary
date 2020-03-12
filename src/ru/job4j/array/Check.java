package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean etalon = data[0];
        boolean result = true;
        for (boolean value: data) {
            if(value != etalon){
                result = false;
                break;
            }
        }
        return result;
    }
}
