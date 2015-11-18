/**
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
 */

import java.util.Scanner;

public class Task_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        int number = scanner.nextInt();

        if (number % 7 == 0 ){

            System.out.println(number*2);
        } else {
            System.out.println("Number is not correct");
        }
    }
}
