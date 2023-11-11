package com.xma.teamscore;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите значение: ");
            String val = scanner.next();
            if (isLong(val)) {
                System.out.println("Целое число");
            } else if (isDouble(val)) {
                System.out.println("Рациональное число");
            } else if (isBoolean(val)) {
                System.out.println("Логическое значение");
            } else {
                System.out.println("Текст");
            }
        }
    }

    private static boolean isLong(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isBoolean(String s) {
        return s.equals("true") || s.equals("false");
    }
}
