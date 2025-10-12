/**
 * @author Hugo Ramirez Jr.
 * @date 10/12/2025
 * @description Utility class for locating largest and smallest values in 2D arrays
 */
public class ArrayUtils {
    // code to locate large or small value in a double array
    public static int[] findLocation(double[][] array, boolean findBiggest) {
        int[] location = new int[2];
        double bestValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((findBiggest && array[i][j] > bestValue) ||
                    (!findBiggest && array[i][j] < bestValue)) {
                    bestValue = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Same code but for int arrays
    public static int[] findLocation(int[][] array, boolean findBiggest) {
        int[] location = new int[2];
        int bestValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((findBiggest && array[i][j] > bestValue) ||
                    (!findBiggest && array[i][j] < bestValue)) {
                    bestValue = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
