package com.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testMaxWithPositiveNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(0);

        Integer result = HugoArrayListTest.max(numbers);
        assertEquals(9, result);
    }

    @Test
    void testMaxWithNegativeNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-10);
        numbers.add(-3);
        numbers.add(-50);
        numbers.add(-1);
        numbers.add(0);

        Integer result = HugoArrayListTest.max(numbers);
        assertEquals(0, result);
    }

    @Test
    void testMaxWithSingleElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        Integer result = HugoArrayListTest.max(numbers);
        assertEquals(5, result);
    }

    @Test
    void testMaxWithEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        Integer result = HugoArrayListTest.max(numbers);
        assertEquals(0, result);
    }

    @Test
    void testMaxWithAllZeros() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        Integer result = HugoArrayListTest.max(numbers);
        assertEquals(0, result);
    }
}
