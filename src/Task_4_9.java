import java.util.Scanner;

/**
 * �������� ������� �� ������� �������:

 ��������� ������� ��� ����������� ������ 5 � �������� �����, ������� ������ ����
 435  -   1
 505  -   2
 555  -   3
 305    - 1
 */
public class Task_4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number % 10;
        int counter = 0;
        if(a == 5){
            counter++;
        }
        if (b == 5){
            counter++;
        }
        if (c == 5){
            counter++;
        }
        System.out.println("There are " + counter + " digits 5 in number " + number);
    }
}

