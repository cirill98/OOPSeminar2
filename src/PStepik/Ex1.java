package PStepik;

//При регистрации на сайтах требуется вводить пароль дважды. Это сделано для безопасности, поскольку такой подход уменьшает возможность неверного ввода пароля.
//
//        Напишите программу, которая сравнивает пароль и его подтверждение. Если они совпадают, то программа выводит: «Пароль принят», иначе: «Пароль не принят».
//
//        Формат входных данных
//        На вход программе подаются две строки.
//
//        Формат выходных данных
//        Программа должна вывести одну строку в соответствии с условием задачи.
import java.util.Scanner;

public class Ex1 extends Equals{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи пароль!");
        String p1 = scanner.nextLine();
        Boolean t = true;
        while (t){
            t= equ(p1);
        }
    }
}

class Equals{
    public static boolean equ(String pass1){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи второй пароль");
        String pass2 = scanner.nextLine();
        if(pass1.equals(pass2)){
            System.out.println("Пароль верный!");
            return false;
        }else {
            System.out.println("Пароль не верный!");
            equ(pass1);
        }
        return false;
    }
}
