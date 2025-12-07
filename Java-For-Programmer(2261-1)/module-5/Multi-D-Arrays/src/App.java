/**
 * @author Hugo Ramirez Jr.
 * @date 10/12/2025
 * Module 5 - Multi-Dimensional Arrays
 * @description Program to locate largest and smallest values in 2D arrays
 */
public class App {
    public static void main(String[] args) {
        // Sample 2D arrays
        int[][] intArray = {
            {5, 2, 8},
            {1, 9, 3},
            {4, 6, 0}
        };

        double[][] doubleArray = {
            {2.5, 7.1, 3.3},
            {4.9, 1.2, 9.8},
            {6.5, 5.4, 2.0}
        };

        // Locate largest and smallest in both arrays
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        //Display results
        System.out.println("\nInt Array:");
        System.out.println("Largest: row " + largestInt[0] + ", col " + largestInt[1]);
        System.out.println("Smallest: row " + smallestInt[0] + ", col " + smallestInt[1]);
        System.out.println("\nDouble Array:");
        System.out.println("Largest: row " + largestDouble[0] + ", col " + largestDouble[1]);
        System.out.println("Smallest: row " + smallestDouble[0] + ", col " + smallestDouble[1]);
    }

    // Methods to locate largest and smallest values in 2D arrays
    public static int[] locateLargest(double[][] arrayParam) {
        return ArrayUtils.findLocation(arrayParam, true);
    }

    public static int[] locateLargest(int[][] arrayParam) {
        return ArrayUtils.findLocation(arrayParam, true);
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        return ArrayUtils.findLocation(arrayParam, false);
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        return ArrayUtils.findLocation(arrayParam, false);
    }
}
