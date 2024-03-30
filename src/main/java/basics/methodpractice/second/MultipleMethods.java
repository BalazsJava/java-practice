package basics.methodpractice.second;

import java.util.Scanner;

public class MultipleMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        printPrettyNumber(inputNumber);
        printOddOrEven(inputNumber);
        printDouble(inputNumber);
    }

    private static void printDouble(int numberToPrint) {
        System.out.println("********************************");
        System.out.println("Your input times two: " + numberToPrint * 2);
        System.out.println("********************************");
    }

    private static void printOddOrEven(int numberToValidate) {
        System.out.println("-------------------------------");
        if (numberToValidate % 2 == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }
        System.out.println("-------------------------------");
    }

    /**
     * Prints number received through the "numberToPrint" parameter
     */
    private static void printPrettyNumber(int numberToPrint) {
        System.out.println("********************************");
        System.out.println("Your input number was: " + numberToPrint);
        System.out.println("********************************");
    }


}
