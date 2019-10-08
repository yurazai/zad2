import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static class Convert {
        Convert(float f1, float f2) {
            faceit1 = f1;
            faceit2 = f2;
        }

        private float faceit1;
        private float faceit2;
    }

    private static boolean compare(Convert c1, Convert c2) {
        return c1.faceit1 * c1.faceit2 < c2.faceit1 * c2.faceit2;
    }

    public static void main(String[] args) {
        // ChessPrinter.printChess(new ChessParams(args));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            float f1;
            float f2;
            try {
                System.out.println("Input first convert:");
                f1 = scanner.nextFloat();
                f2 = scanner.nextFloat();
                Convert convert1 = new Convert(f1, f2);

                System.out.println("Input second convert:");
                f1 = scanner.nextFloat();
                f2 = scanner.nextFloat();
                Convert convert2 = new Convert(f1, f2);

                if (compare(convert1, convert2)) {
                    System.out.println("convert 2 is > convert 1");
                }
                else {
                    System.out.println("convert 2 is < convert 1");
                }

                System.out.println("hotite ewe?");

                scanner.nextLine();
                String answer = scanner.nextLine();

                if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))) {
                    System.out.println("se ya");
                    return;
                }

            } catch (InputMismatchException e) {
                System.out.print(e.getMessage()); //try to find out specific reason.
            }
        }

    }
}
