package basics.methodpractice.third;

import java.util.Scanner;

public class MultipleMethodsMultipleParameters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        // The "printDecoratedNumber" method is called with different parameters
        // This lets you easily modify the preferred decoration
        printDecoratedNumber(inputNumber, "*");
        printDecoratedNumber(inputNumber, "|");

        // This method now lets you choose how many times you want to multiply the number
        printMultipliedNumber(inputNumber, 2);
        printMultipliedNumber(inputNumber, 10);
    }

    private static void printMultipliedNumber(int numberToPrint, int multiplyBy) {
        printDecoration("*");
        System.out.println("Your input times two: " + numberToPrint * multiplyBy);
        printDecoration("*");

        System.out.println(); // New line
    }

    /**
     * Prints number received through the "numberToPrint" parameter
     */
    private static void printDecoratedNumber(int numberToPrint, String decoration) {
        // You can call methods from methods, to keep them all simple
        printDecoration(decoration);
        System.out.println("Your input number was: " + numberToPrint);
        printDecoration(decoration);

        System.out.println(); // New line
    }

    /**
     * Prints the given string, repeating it 30 times.
     */
    private static void printDecoration(String decoration) {
        // Keeping methods simple and short makes it easy to define and to implement them
        String repeatedDecoration = decoration.repeat(30);
        System.out.println(repeatedDecoration);
    }


}
