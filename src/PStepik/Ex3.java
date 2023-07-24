package PStepik;

//Напишите программу, которая проверяет, что для заданного четырехзначного числа выполняется следующее соотношение: сумма первой и последней цифр равна разности второй и третьей цифр.
//
//        Формат входных данных
//        На вход программе подаётся одно целое положительное четырёхзначное число.
//
//        Формат выходных данных
//        Программа должна вывести «ДА», если соотношение выполняется, и «НЕТ» — если не выполняется.
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvevite chislo: ");
        int num = scanner.nextInt();
        if((num/1000 + num%10)==(num/100%10 - num%100/10)){
            System.out.println("Да");
        }else {
            System.out.println("Нет");
        }
    }


}
