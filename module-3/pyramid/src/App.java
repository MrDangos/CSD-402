// Author: Hugo Ramirez Jr.
// Date: 2024-06-10
// Description: This program prints a triangle of numbers with an @ symbol at designated column.
public class App {
    public static void main(String[] args) {
        int rows = 7;         
        int atColumn = 32; // column where '@' should align
        printTriangle(rows, atColumn);
    }
    
    // Method to print triangle
    public static void printTriangle(int totalRows, int atColumn) {

        for (int currentRow = 0; currentRow < totalRows; currentRow++) {
            // Calculate and print leading spaces
            int leadingSpaces = totalRows - currentRow - 1;
            printSpaces(leadingSpaces, 2);

            // Build the row of numbers and print it
            String row = buildRow(currentRow);
            System.out.print(row);

            // Calculate and print spaces to align '@'
            int spacesNeeded = atColumn - row.length() - (leadingSpaces * 2);
            printSpaces(spacesNeeded, 1);
            System.out.println("@");
        }
    }

    // Method to build a row of numbers
    public static String buildRow(int rowIndex) {
        StringBuilder sb = new StringBuilder();
        int value = 1;

        // Increasing numbers
        for (int i = 0; i <= rowIndex; i++) {
            sb.append(value).append(" ");
            value *= 2;
        }

        // Decreasing numbers
        value /= 2;
        for (int i = 0; i < rowIndex; i++) {
            value /= 2;
            sb.append(value).append(" ");
        }

        return sb.toString();
    }

    // Method to print spaces
    public static void printSpaces(int spacesNeeded, int size) {
        for (int i = 0; i < spacesNeeded * size; i++) {
            System.out.print(" ");
        }
    }
}
