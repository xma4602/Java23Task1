package com.xma.teamscore;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму товара: ");
        double fullPrice = scanner.nextDouble();
        double selfPrice = fullPrice / 120 * 100;
        double ndsPrice = fullPrice - selfPrice;
        System.out.printf("Стоимость товара без НДС: %.2f %n", Math.round(selfPrice * 100) / 100.0);
        System.out.printf("Сумма НДС в чеке: %.2f %n", Math.round(ndsPrice * 100) / 100.0);
        System.out.printf("Сумма НДС для налоговой декларации: %d %n", Math.round(ndsPrice));
    }
}
