package PHabr;

//1.0. Максимальное, минимальное и среднее значение
//
//        Задача:
//
//        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
       int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        Arrays.sort(arr);
        int x = (arr[0] + arr[arr.length - 1]) / 2;

        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное значение: " + arr[0]);
        System.out.println("Среднее значение: " + arr[arr.length / 2]);
        System.out.println("Максимальное значение: " + arr[arr.length -1]);
    }
}
