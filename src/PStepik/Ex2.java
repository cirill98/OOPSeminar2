package PStepik;

//Напишите программу, которая определяет, является число четным или нечетным.
//
//        Формат входных данных
//        На вход программе подаётся одно целое число.
//
//        Формат выходных данных
//        Программа должна вывести «Четное», если число четное, и «Нечетное» — если число нечетное.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        Chetnoe(num);

    }
    static void Chetnoe(int x){
        if(x%2==0){
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
    }

}

