package PAlgoritm;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Загадайте число: ");
        int item = scanner.nextInt();
        int low = arr[0];
        int high = arr.length - 1;
        while (low<=high){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if(num==item){
                System.out.printf("Вы победили, заганное число %d", num);
                break;
            }else if(num < item){
                low = num + 1;
                System.out.println("Мало");
            }else {
                high = num - 1;
                System.out.println("Много");
            }
        }

    }
}
