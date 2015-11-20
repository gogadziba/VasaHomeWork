import java.util.Scanner;

/**
 * 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 * лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */
public class Task_4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double a = scanner.nextInt();
        System.out.print("Enter number2: ");
        double b = scanner.nextInt();
        System.out.print("Enter number3: ");
        double c = scanner.nextInt();
        double d = Math.pow(a, b);

        if (d == c) // Переделать!!! Можно ввести 0 и будет работать.
            System.out.println("Correct rectangular triangle");
        else {
            System.out.println("Incorrect triangle");
        }
    }
}

