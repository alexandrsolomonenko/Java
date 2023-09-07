package HomeWork;

import java.util.Scanner;

public class HW29082023 {
    public static void main(String[] args) {

//        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//                Например:
//        ввод - mama, papa
//        вывод - mapa

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово mama: ");
        String wort1 = scanner.next();
        System.out.print("Введите слово papa: ");
        String wort2 = scanner.next();
        String wort3 = (wort1.substring(0, wort1.length()/2))+(wort2.substring(0, wort2.length()/2));
        System.out.print("Полученное слово: "+wort3);
        System.out.println();
        System.out.println();

//        Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите Число: ");
        int a = scanner1.nextInt();
        System.out.print("Введите Второе Число: ");
        int b = scanner1.nextInt();

        int c = (a + b);
        int d = (a - b);
        int e = (a * b);
        int g = (a / b);
        System.out.println("Вывод арифметических операций на экран: ");
        System.out.println("Сложение: "+c+" Вычитание: "+d+" Умножение: "+e+" Деление: "+g );





    }




}
