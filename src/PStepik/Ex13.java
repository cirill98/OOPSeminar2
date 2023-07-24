package PStepik;
//Напишите программу, которая находит наименьшее и наибольшее из пяти чисел.
//
//        Формат входных данных
//        На вход программе подается пять целых чисел, каждое на отдельной строке.
//
//        Формат выходных данных
//        Программа должна вывести наименьшее и наибольшее число с поясняющей надписью.

import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Наименьшее число = " + min);
        System.out.println("Наибольшее число = " + max);
    }
}
