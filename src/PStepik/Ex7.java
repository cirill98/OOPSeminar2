package PStepik;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex7 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите число: ");
            arr[i] = scanner.nextInt();
        }

//        Найти максимальное число в массиве итеративным способом
//        int minMax = arr[0];
//        for (int x:arr) {
//            if(x<minMax){
//                minMax = x;
//            }
//        }

//        Найти максимальное число в массиве с помощью Stream
//        IntStream intStream = Arrays.stream(arr);
//        OptionalInt optionalInt = intStream.min();
//        int minMax = optionalInt.getAsInt();

//        Найти максимальное число в массиве с помощью Arrays.sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minMax =arr[0];
        System.out.println("Минимальное значение - " + minMax);

    }
}
