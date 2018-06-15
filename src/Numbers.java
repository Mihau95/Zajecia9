import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;


        do {
            System.out.println("Podaj liczbe " + i);
            try {
                int index = scanner.nextInt();

                System.out.println(numbers[index]);
                i++;
            } catch (InputMismatchException ex) {
                System.out.println("Podaj liczbe!");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Bledna liczba!");
            }
        } while (i <= 5);
            sum += numbers[i];
            System.out.println("Suma: " + sum);
    }
}
