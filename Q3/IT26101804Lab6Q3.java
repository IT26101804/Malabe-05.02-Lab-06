import java.util.Scanner;

public class IT26101804Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumSquares = 0;
        int count = 0;
        int number;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            // Sentinel value
            if (number == -99) {
                break;
            }

            // Validate negative input
            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            // Calculate sum of squares
            sumSquares += number * number;
            count++;
        }

        // Calculate RMS
        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);

            System.out.println("\nNumber of values entered: " + count);
            System.out.println("Sum of squares: " + sumSquares);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("\nNo positive numbers were entered.");
        }

        input.close();
    }
}
