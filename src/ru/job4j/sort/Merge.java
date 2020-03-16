package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0; //счетчик первого массива
        int j = 0; //счетчик второго массива
        int k = 0; //счетчик общего массива
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                rsl[k] = right[j];
                j++;
            } else {
                rsl[k] = left[i];
                i++;
            }
            k++;
        }
        while (k < rsl.length) {
            if (j < right.length) {
                rsl[k] = right[j];
                j++;
            } else {
                rsl[k] = left[i];
                i++;
            }
            k++;
        }
        //массивы перебираем по минимальному
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
