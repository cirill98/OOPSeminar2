package PStepik;

//Напишите программу, которая определяет, являются ли три заданных числа (в указанном порядке) последовательными членами арифметической прогрессии.
//
//        Формат входных данных
//        На вход программе подаются три числа, каждое на отдельной строке.
//
//        Формат выходных данных
//        Программа должна вывести «YES» или «NO» (без кавычек) в соответствии с условием задачи.
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int x2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int x3 = scanner.nextInt();
        if(x2-x1==x3-x2 || x1 -x2==x2-x3){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }


}
