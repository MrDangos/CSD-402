import java.util.Comparator;
/**
 * @author Hugo Ramirez Jr.
 * @date 01/31/2026
 * @Module_6 - Bubble Sorting 
 * @description This program implements the Bubble Sort algorithm in Java. It includes two versions of the algorithm:
 * one that sorts arrays of Comparable elements and another that sorts arrays using a provided Comparator.
 */
public class BubbleSort {

    public static void main(String[] args) {

        // ===== test useing numbers =====
        Integer[] numbers = {5, 3, 4, 9, 0, 1, 2, 7, 6, 8};

        System.out.println("Original Integer Array:");
        printArray(numbers);
        bubbleSort(numbers);

        System.out.println("Sorted Integer Array:");
        printArray(numbers);

        // ===== test using fruit =====
        String[] words = {"banana", "apple", "orange", "pear", "grape"};

        System.out.println("\nOriginal Fruit Array:");
        printArray(words);
        bubbleSort(words, Comparator.comparingInt(String::length));

        System.out.println("Sorted Fruit Array by length:");
        printArray(words);
        System.out.println();
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean swapped;

        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < list.length - 1; j++) {

                // Compare adjacent elements
                if (list[j].compareTo(list[j + 1]) > 0) {

                    // Swap elements
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean swapped;

        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < list.length - 1; j++) {

                if (comparator.compare(list[j], list[j + 1]) > 0) {

                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + ", ");
        }
        System.out.println(" ");
    }
}
