package com.xma.teamscore;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        long totalMinutes = getTime(args);
        if (totalMinutes <= 0) {
            System.out.println("Уже началось!");
        } else {
            long minutes = totalMinutes % 60;
            long hours = (totalMinutes / 60) % 60;
            long days = totalMinutes / 3600;

            System.out.printf("%d – это %s %s %s",
                    totalMinutes, getDays(days), getHours(hours), getMinutes(minutes)
            );
        }

    }

    private static String getMinutes(long minutes) {
        return switch ((int) (minutes % 10)) {
            case 2, 3, 4 -> minutes + " минуты";
            case 1 -> minutes + " минута";
            default -> minutes + " минут";
        };
    }

    private static String getHours(long hours) {
        return switch ((int) (hours % 10)) {
            case 2, 3, 4 -> hours + " часа";
            case 1 -> hours + " час";
            default -> hours + " часов";
        };
    }

    private static String getDays(long days) {
        return switch ((int) (days % 10)) {
            case 2, 3, 4 -> days + " дня";
            case 1 -> days + " день";
            default -> days + " дней";
        };
    }

    private static long getTime(String[] args) {
        if (args.length == 1) {
            return Long.parseLong(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число минут: ");
            return scanner.nextLong();
        }
    }
}
