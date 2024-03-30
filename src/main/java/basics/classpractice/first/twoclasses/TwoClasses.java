package basics.classpractice.first.twoclasses;

import java.util.Scanner;

public class TwoClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        // Creating a new instance from the class: NumberPrinter
        NumberPrinter printer = new NumberPrinter();

        // This allows you to call the NumberPrinter class method: printInputNumber
        printer.printInputNumber(inputNumber);
    }

}
