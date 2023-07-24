package PHabr;

//Реализуйте алгоритм сортировки пузырьком для сортировки массива


import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }














//        int[] sort = new int[arr.length];
//        int index = 0;
//
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(min > arr[i]){
//                min = arr[i];
//                sort[index+=1] = min;
//            }else {
//                continue;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sort));
//        System.out.println(min);
    }
}
