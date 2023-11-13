package com.xma.teamscore;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max = 1;

        int num;
        int count = 0;
        int curSign;
        int prevSign = 0;

        System.out.print("Сколько сгеренировать чисел: ");
        int n = scanner.nextInt();
        System.out.println("|   № | число | знак | длина серии |");

        for (int i = 1; i <= n; i++) {
            num = random.nextInt(2000) - 1000;
            curSign = Integer.signum(num);
            if (curSign == prevSign){
                count++;
            } else {
                if (count > max) max = count;
                count = 1;
            }
            System.out.printf("| %3d | %5d | %4s | %11d |%n", i, num, getSign(curSign), count);
            prevSign = curSign;
        }
        System.out.println("Самая длинная серия: " + max);
    }

    private static String getSign(int num) {
        if (num == 1) return "+";
        if (num == -1) return "-";
        return "0";
    }
}
