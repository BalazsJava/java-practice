package basics.classpractice.first.oneclass;

import java.util.Scanner;

// This is the only class here: SingleClass
public class SingleClass {

    /**
     * Prints the number entered on the console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        System.out.println(inputNumber); // Printing the number within same class
    }


}
