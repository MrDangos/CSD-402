/**
 * M4 AVERAGE ARRAY CALCULATOR
 * Displays the average of different arrays using methods and AverageCalculator class
 * @author Hugo Ramirez Jr
 * @date 10/05/2025
 */
public class App {
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30, 40, 50};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {5.5, 10.5, 15.5, 20.5, 25.5, 30.5};

        System.out.println("----- AVERAGE ARRAY CALCULATOR -----\n");

        System.out.print("Short Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + AverageCalculator.average(shortArray) + "\n"); // calculate and display avg

        System.out.print("Int Array: ");
        displayArray(intArray);
        System.out.println("Average: " + AverageCalculator.average(intArray) + "\n");

        System.out.print("Long Array: ");
        displayArray(longArray);
        System.out.println("Average: " + AverageCalculator.average(longArray) + "\n");

        System.out.print("Double Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + AverageCalculator.average(doubleArray) + "\n");
    }

    // Displaying arrays
    public static void displayArray(short[] array) {
        for (short num : array) System.out.print(num + " ");
        System.out.println();
    }

    public static void displayArray(int[] array) {
        for (int num : array) System.out.print(num + " ");
        System.out.println();
    }

    public static void displayArray(long[] array) {
        for (long num : array) System.out.print(num + " ");
        System.out.println();
    }

    public static void displayArray(double[] array) {
        for (double num : array) System.out.print(num + " ");
        System.out.println();
    }
}
