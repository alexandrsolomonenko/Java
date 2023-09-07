package homework;

import java.util.Scanner;

public class homework05092023Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа:");
        System.out.print("Первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Третье число: ");
        int num3 = scanner.nextInt();
        int max = maxNumber(num1, num2, num3);

        System.out.println("Максимальное число: " + max);

        }

    public static int maxNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

        }



    }

