import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by Vasssa on 18.11.2015.
 */
public class Task_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 & number1 <number3 ) System.out.println(number1);
        else if (number2 < number1 & number2 < number3) System.out.println(number2);
        else System.out.println(number3);

        if (number1 > number2 & number1 > number3) System.out.println(number1);
        else if (number2 > number1 & number2 > number3) System.out.println(number2);
        else System.out.println(number3);

    }
}

