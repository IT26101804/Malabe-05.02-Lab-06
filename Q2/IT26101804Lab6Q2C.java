import java.util.Scanner;

public class IT26101804Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 0;
        int sum = 0;

        // Enter 10 numbers
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
            i++;
        }

        // Calculate average
        double average = (double) sum / 10;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}
