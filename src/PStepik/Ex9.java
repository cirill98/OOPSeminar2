package PStepik;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 3;
        int sum = 0;
        while (x > 0){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if(num >=0)
                sum+=num;
            x -=1;
        }
        System.out.println("сумма положительных чисел: "+ sum);

    }
}
