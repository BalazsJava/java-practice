package basics.methodpractice.first;

import java.util.Scanner;

public class NoExtraMethod {

    /**
     * Prints the number entered on the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        System.out.println(inputNumber); // Printing the number directly
    }

}
