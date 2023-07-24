package PStepik;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        System.out.printf("Дробная часть %.2f", num - ((int)num));
    }
}

