import java.util.Scanner;

/**
 * 1) ������ � ���������� �������� ���� ������ ������������ a, b � c � ������-
 * ����, �������� �� �� �������������. ����� ������� � ���� ���������.
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

        if (d == c) // ����������!!! ����� ������ 0 � ����� ��������.
            System.out.println("Correct rectangular triangle");
        else {
            System.out.println("Incorrect triangle");
        }
    }
}

