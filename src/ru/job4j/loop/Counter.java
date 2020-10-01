package ru.job4j.loop;

public class Counter {
    public static long sum(long start, long finish) {
        long sum = 0;
        for (; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(9, 10));
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 1234567890));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}