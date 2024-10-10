package com.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MyArraysTest {

    @Test
    public void testMinimum() {
        int[] a = {1, 5, 6, 7, 2, 3, 4, 9, 10, 8};
        int result = MyArrays.minimum(a);
        assertEquals(1, result);

        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        result = MyArrays.minimum(b);
        assertEquals(1, result);
    }

    @Test
    public void testMinimumWithEmptyArray() {
        int[] a = {};
        assertThrows(IllegalArgumentException.class, () -> MyArrays.minimum(a));
    }

    @Test
    public void testMinimumWithNullArray() {
        int[] a = null;
        assertThrows(IllegalArgumentException.class, () -> MyArrays.minimum(a));
    }

    @Test
    public void testMean() {
        double[] a = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        double result = MyArrays.mean(a);
        assertEquals(5.96, result, 0.001);
    }

    @Test
    public void testMeanWithEmptyArray() {
        double[] a = {};
        assertThrows(IllegalArgumentException.class, () -> MyArrays.mean(a));
    }

    @Test
    public void testMeanWithNullArray() {
        double[] a = null;
        assertThrows(IllegalArgumentException.class, () -> MyArrays.mean(a));
    }
}
