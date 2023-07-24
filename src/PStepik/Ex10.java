package PStepik;

//На числовой прямой даны два отрезка:
//        a1 b b1
//        a2 b b2.
//        Напишите программу, которая находит их пересечение.
//
//        Пересечением двух отрезков может быть:
//
//        отрезок;
//        точка;
//        пустое множество.
//        Формат входных данных
//        На вход программе подаются 4 целых числа, каждое на отдельной строке. Гарантируется, что
//
//        Формат выходных данных
//        Программа должна вывести на экран границы отрезка, являющегося пересечением, либо общую точку, либо текст «пустое множество».

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте границы первого отрезка!");
        System.out.print("Начало, а1: ");
        int a1 = scanner.nextInt();
        System.out.print("Конец, b1: ");
        int b1 = scanner.nextInt();

        System.out.println("Задайте границы второго отрезка!");
        System.out.print("Начало, а2: ");
        int a2 = scanner.nextInt();
        System.out.print("Конец, b2: ");
        int b2 = scanner.nextInt();
        if (b1 == a2){
            System.out.printf("Точка пересечения двух отрезков %d", b1);
        } else if (a2 < b1) {
            System.out.printf("Отрезок пересечения двух отрезков %d и %d", a2, b1);

        } else {
            System.out.println("Пустое множество");
        }
    }
}
