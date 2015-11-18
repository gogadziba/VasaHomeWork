/**
 * 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time: ");

        int time = scanner.nextInt();

        if (time>=9 && time<=18){
            System.out.println("I'm still at work");
        }else {
            System.out.println("I'm at home");
        }


    }
}

 /**      if(time == 9){
            System.out.println("I'm still at work ");
        }
        else if (time == 10) {
            System.out.println("I'm still at work ");
        }
        else if (time == 11) {
            System.out.println("I'm still at work ");
        }
        else if (time == 12) {
            System.out.println("I'm still at work ");
        }
        else if (time == 13) {
            System.out.println("I'm still at work ");
        }
        else if (time == 14) {
            System.out.println("I'm still at work ");
        }
        else if (time == 15) {
            System.out.println("I'm still at work ");
        }
        else if (time == 16) {
            System.out.println("I'm still at work ");
        }
        else if (time == 17) {
            System.out.println("I'm still at work ");
        }
        else if (time == 18) {
            System.out.println("I'm still at work ");
        }
        else System.out.println("I'm not at work");
  */