package PStepik;

//Роскомнадзор
//        Напишите программу, которая определяет, разрешен ли пользователю доступ к интернет-ресурсу или нет.
//
//        Формат входных данных
//        На вход программе подаётся целое число — возраст пользователя.
//
//        Формат выходных данных
//        Программа должна вывести текст «Доступ разрешен», если возраст не менее 18, и «Доступ запрещен» - в противном случае
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>= 18){
            System.out.println("Доступ разрешен!");
        }else {
            System.out.println("Доступ запрещен!");
        }
    }
}
