package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }
    public static int max(int first, int second, int third) {
        int n = max(first, second);
        return max(n, third);
    }

    public static int max(int first, int second, int third, int four) {
        int n = max(first, second, third);
        return max(n, four);
    }
}
