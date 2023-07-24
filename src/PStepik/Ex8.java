package PStepik;

import java.util.Scanner;

//Напишите программу, которая по введённому возрасту пользователя сообщает, к какой возрастной группе он относится:
//
//        до 13 включительно – детство;
//        от 14 до 24 – молодость;
//        от 25 до 59 – зрелость;
//        от 60 – старость.
//        Формат входных данных
//        На вход программе подаётся одно целое число – возраст пользователя.
//
//        Формат выходных данных
//        Программа должна вывести название возрастной группы.
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int year = scanner.nextInt();
        if(year <=13)
            System.out.println("детство");
        else if(year >= 14 & year <=24)
            System.out.println("молодость");
        else if (year >= 25 & year <=59)
            System.out.println("зрелость");
        else
            System.out.println("старость");
    }
}
