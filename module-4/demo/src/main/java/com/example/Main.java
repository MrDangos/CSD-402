package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 01/17/2026
 * @Module_4 - LinkedList Performance Comparison
 * @description This program compares the performance of traversing a LinkedList
 * using an iterator versus using the get(index) method.
 * 
 * Comments:
 * LinkedList is not optimized for index-based access, making get(index) traversal
 * a lot slower than iterator traversal, especially as the list size increases.
 * iterator traversal is around 2.3 to 2.5 ms for 50,000 elements and around 4.8 to 5.8 ms for 500,000 elements.
 * get(index) traversal takes longer, around 709 to 716 ms for 50,000 elements. Although this is still less then 1 second,
 * it becomes significantly slower than iterator traversal when going to 500,000 elements, taking around 69204 to 96118 ms (or 1.15 to 1.6 mintues).
 */
import java.util.LinkedList;

public class Main {
    public static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String [] args){
        linkedListTest(50_000);
        linkedListTest(500_000); 
    }

    public static void linkedListTest(int size) {
        list.clear();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long iteratorTime = traverseWithIterator(list);
        long getTime = traverseWithGet(list);

        double iteratorMs = iteratorTime / 1_000_000.0;
        double getMs = getTime / 1_000_000.0;

        System.out.println();
        System.out.println(size + " Traversal Times:");
        System.out.println("Iterator traversal time: " + iteratorMs + " ms");
        System.out.println("get(index) traversal time: " + getMs + " ms");
    }

    private static long traverseWithIterator(LinkedList<Integer> list) {
        long start = System.nanoTime();

        java.util.Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }

        return System.nanoTime() - start;
    }

    private static long traverseWithGet(LinkedList<Integer> list) {
        long start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return System.nanoTime() - start;
}


}