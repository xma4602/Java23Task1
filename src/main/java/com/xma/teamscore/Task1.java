package com.xma.teamscore;

public class Task1 {
    public static double[] numbers = new double[]{30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675};
    public static String[] numbersStrings = new String[]{"30.0", "10000.1", "12.5", "99.99", "0.0", "-23.45", "-4.5", "-129.675"};

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("____________________________________________\n");
        builder.append("|    Число | flour | ceil  | round | rint  |\n");
        builder.append("|------------------------------------------|\n");
        for (int i = 0; i < numbers.length; i++) {
            builder.append("| %8s | %5.0f | %5.0f | %5d | %5.0f |\n".formatted(
                    numbersStrings[i],
                    Math.floor(numbers[i]),
                    Math.ceil(numbers[i]),
                    Math.round(numbers[i]),
                    Math.rint(numbers[i])
            ));
        }
        builder.append("|------------------------------------------|\n");

        System.out.println(builder);

    }
}
