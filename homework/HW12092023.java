package HomeWork;

import java.util.Arrays;
import java.util.Random;

public class HW12092023 {
    public static void main(String[] args) {

//        Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.

//        int[] array = new int[8];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(50) + 1;
//        }
//
//        System.out.println("Массив до замены: " + Arrays.toString(array));
//
//        for (int i = 1; i < array.length; i += 2) {
//            array[i] = 0;
//        }

//        System.out.println("Массив после замены: " + Arrays.toString(array));

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }

    }
}
