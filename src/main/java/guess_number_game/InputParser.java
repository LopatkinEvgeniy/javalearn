package guess_number_game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputParser {
    private final int min;
    private final int max;
    private final Scanner scanner;

    public InputParser(int min, int max) {
        this.min = min;
        this.max = max;
        this.scanner = new Scanner(System.in);
    }

    public int prompt() {
        while (true) {
            System.out.print("Enter a number: ");

            int result;

            try {
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                this.scanner.nextLine(); // clear scanner buffer after an error
                System.out.println("Invalid input. A non-numeric value was entered");
                continue;
            }

            if (result < min) {
                System.out.println("Invalid input. The number can't be less that " + min);
                continue;
            }
            if (result > max) {
                System.out.println("Invalid input. The number can't be greater that " + max);
                continue;
            }

            return result;
        }
    }

    public void close() {
        this.scanner.close();
    }
}
