import java.util.Scanner;

/**
 * 4.7. ������ ��� �����, ���� ���� �� ��� �������� �� ������ ��� �������,
 �� ������� true � ���������� ��������� ������� (����� ����� �� �������  � ������)
 � ������ ������ ������� false � ���������� ��������� ������� (����� ����� �� �������  � ������)
 */
public class Task_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();


        if(number1 % number2 == 0)
            System.out.println("True " + number1 / number2);
        else
            System.out.println("False " + number1 / number2);

            }
        }

