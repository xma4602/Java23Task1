package com.xma.teamscore;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        int count = 0;
        double sum = 0;
        double average = 0;
        double num;

        System.out.println("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                num = Double.parseDouble(scanner.nextLine());
                count++;
                sum += num;
                if (num < min) min = num;
                if (num > max) max = num;
            }
        } catch (NumberFormatException ignored) {
        } finally {
            if (count > 0) {
                average = sum / count;
            }
            else {
                max = min = Double.NaN;
            }
            System.out.println("Количество: " + count);
            System.out.println("Минимальное: " + min);
            System.out.println("Максимальное: " + max);
            System.out.println("Сумма: " + sum);
            System.out.println("Среднее: " + average);
        }

    }
}
