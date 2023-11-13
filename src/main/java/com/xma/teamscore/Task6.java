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
                    totalMinutes,
                    getFormattedTime(days, "день", "дня", "дней"),
                    getFormattedTime(hours, "час", "часа", "часов"),
                    getFormattedTime(minutes, "минута", "минуты", "минут")
            );
        }
    }

    private static String getFormattedTime(long time, String oneFormat, String twoThreeFourFormat, String manyFormat) {
        if (5 <= time && time <= 20) return time + " " + manyFormat;
        long t = time % 10;
        if (t == 1) return time + " " + oneFormat;
        if (t == 2 || t == 3 || t == 4) return time + " " + twoThreeFourFormat;
        return time + " " + manyFormat;
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
