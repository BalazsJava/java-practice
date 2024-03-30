package basics.methodpractice.first;

import java.util.Scanner;

public class SingleMethodMultipleCalls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        // Calling the method: printInputNumber(int), instead of directly printing it
        printInputNumber(inputNumber);

        // You can call this method as many times as you want
        // Makes things easier, since you don't have to repeat the "System.out.println" all the time
        printInputNumber(inputNumber * 2);
        printInputNumber(inputNumber + 5);
    }

    /**
     * Prints number received through the "numberToPrint" parameter
     */
    private static void printInputNumber(int numberToPrint) {
        System.out.println(numberToPrint);
    }


}
