import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 * тельные заменить на 0.
 */
public class Task_4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        if (number1 >= 0) System.out.println(number1 = number1 * number1 * number1);
        else if (number1 <= 0) System.out.println(number1 = 0);

        if (number2 >= 0) System.out.println(number2 = number2 * number2 * number2);
        else if (number2 <= 0) System.out.println(number2 = 0);

        if (number3 >= 0) System.out.println(number3=number3*number3*number3);
        else if (number3 <= 0) System.out.println(number3 = 0);
    }
}
