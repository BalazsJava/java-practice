package basics.methodpractice.first;

import java.util.Scanner;

public class SingleMethod {

    /**
     * Prints the number entered on the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        // Calling the method: printInputNumber(int), instead of directly printing it
        printInputNumber(inputNumber);
    }

    /**
     * Prints number received through the "numberToPrint" parameter
     */
    private static void printInputNumber(int numberToPrint) {
        System.out.println(numberToPrint);
    }


}
