/**
 * 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
 Если второе больше, то выводим сумму.
*/

import java.util.Scanner;

public class Task_4_5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int number2 = scanner2.nextInt();
        int result;

        if (number1 > number2)
            System.out.println(result = number1 - number2);
        else {
            System.out.println(result = number1 + number2);
        }
        }
    }


