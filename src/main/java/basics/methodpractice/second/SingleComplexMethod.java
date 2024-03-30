package basics.methodpractice.second;

import java.util.Scanner;

public class SingleComplexMethod {

    /**
     * Prints the number entered on the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        printPrettyNumber(inputNumber);

        // This may make it more understandable why it's good to use methods
        // The usage remains simple, despite that its implementation is getting more complex
        printPrettyNumber(inputNumber + 1);
        printPrettyNumber(inputNumber + 2);
    }

    /**
     * Prints number received through the "numberToPrint" parameter in a decorated manner.
     */
    private static void printPrettyNumber(int numberToPrint) {
        System.out.println("********************************");
        System.out.println("Pretty number: " + numberToPrint);
        System.out.println("********************************");
    }


}
