import java.util.InputMismatchException;
import java.util.Scanner;

public class Titles {
    public static void main(String[] args) {
        String[] titles = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Napis " + i);
            titles[i] = scanner.nextLine();
        }

            try {
                int index = scanner.nextInt();

                System.out.println(titles[index]);
                System.out.println("Napis prawidlowy!");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Bledny napis!");
            } catch (InputMismatchException ex) {
                System.out.println("Blad!");
            }
    }
}