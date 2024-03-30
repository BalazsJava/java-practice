package basics.classpractice.second.classvariable;

import java.util.Scanner;

public class ClassVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        // Creating a new instance from the class: NumberPrinter
        // The "inputNumber" is immediately given to the class as a parameter
        NumberPrinter renameMe = new NumberPrinter(inputNumber);

        // No longer need to pass the "inputNumber" to every method call
        renameMe.printPrettyNumber();
        renameMe.printOddOrEven();
        renameMe.printDouble();
    }

    // HINTS:

    // - You can CTRL+click on a method to jump into it
    //    - Can also do this to find usages

    // - CTRL+TAB to jump back and forth between recent classes

    // - SHIFT+F6 lets you rename variables, method names, class names, parameter names etc.
    //     - Good thing about this is it changes them at all usages, try renaming the "renameMe" variable
}
