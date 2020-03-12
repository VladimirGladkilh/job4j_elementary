package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        if (array.length > source && array.length > dest) {
            int buf = array[source];
            array[source] = array[dest];
            array[dest] = buf;
        }
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        /*for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }*/
        //поумуто при коммите пишет варнинги с предложением переписать все под расширеный цикл for
        //попробую так. Может не будет
        for (int index : rsl) {
            System.out.println(index);
        }
    }
}
