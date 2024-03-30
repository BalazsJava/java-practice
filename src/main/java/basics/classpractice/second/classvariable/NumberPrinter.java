package basics.classpractice.second.classvariable;

class NumberPrinter {

    private final int inputNumber; // All the methods can reach this variable within the class

    // This is called the constructor, because it constructs the class
    NumberPrinter(int inputNumber) {
        this.inputNumber = inputNumber; // The variable is being initialized
    }

    // The methods may not be "static" to reach a class variable
    void printDouble() {
        System.out.println("********************************");
        System.out.println("Your input times two: " + inputNumber * 2); // Easily accessing the class variable (Also different color)
        System.out.println("********************************");
    }

    void printOddOrEven() {
        System.out.println("-------------------------------");
        if (inputNumber % 2 == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }
        System.out.println("-------------------------------");
    }

    // SHIFT+click the method name to jump to where it is called from
    void printPrettyNumber() {
        System.out.println("********************************");
        System.out.println("Your input number was: " + inputNumber);
        System.out.println("********************************");
    }

}
