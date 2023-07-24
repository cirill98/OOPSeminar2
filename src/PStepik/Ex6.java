package PStepik;

//Напишите программу, которая определяет наименьшее из двух чисел.
//
//        Формат входных данных
//        На вход программе подаётся два различных целых числа.
//
//        Формат выходных данных
//        Программа должна вывести наименьшее из двух чисел.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int[] minMax = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = scanner.nextInt();
        if(num1<num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
}
