package main.sorting_algorithms.n;

import main.sorting.AbstractSorting;
import util.Util;

import java.util.Arrays;

import static util.Util.getBiggestElement;

/**
 *
 */
public class CountingSort extends AbstractSorting<Integer> {
    @Override
    public void sort(Integer[] array, int leftIndex, int rightIndex) {
        countingSort(array, leftIndex, rightIndex);
    }

    private void countingSort(Integer[] array, int leftIndex, int rightIndex) {

        if (array.length == 0)
            return;

        Integer[] temp = new Integer[rightIndex-leftIndex + 1];
        Integer[] counter = new Integer[(int) getBiggestElement(array, leftIndex, rightIndex) + 1];
        for (int i = 0; i < counter.length; i++) counter[i] = 0;

        for (int i = leftIndex; i <= rightIndex ; i++) counter[array[i]]++;

        for (int i = 1; i < counter.length; i++) counter[i] += counter[i-1];

        for (int i = leftIndex; i <= rightIndex ; i++) temp[--counter[array[i]]] = array[i];

        for (int i = leftIndex; i <= rightIndex; i++) array[i] = temp[i];
    }
}
