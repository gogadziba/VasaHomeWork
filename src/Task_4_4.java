/**
 * 4.4. ������ ����� � ��������� ������ � �������, � ��������� ����� �� ��� � ��������� �� 0 �� 1
 */

import java.util.Scanner;

public class Task_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number: ");
        double number = scanner.nextDouble();

        if (number >= 0 && number <= 1) {
            System.out.println("Success");
        } else {
            System.out.println("Incorrect number");
        }
    }
}