import java.util.Scanner;

/**
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class Task_4_6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int number2 = scanner2.nextInt();
        int result = number1 + number2;

        if (result>=11&& result<=19)
            System.out.println(result);
        else {
            System.out.println("Wrong way!");
        }


    }
}
