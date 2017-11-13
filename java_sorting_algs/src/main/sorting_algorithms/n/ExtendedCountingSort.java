package main.sorting_algorithms.n;

import main.sorting.AbstractSorting;
import util.Util;

import java.util.Arrays;

import static util.Util.getBiggestElement;
import static util.Util.getSmallerElement;

public class ExtendedCountingSort extends AbstractSorting<Integer> {
    @Override
    public void sort(Integer[] array, int leftIndex, int rightIndex) {
        extendedCountingSort(array, leftIndex, rightIndex);
    }

    public void extendedCountingSort(Integer[] array, int leftIndex, int rightIndex) {

        if (array.length == 0) return;

        int smaller = (int) getSmallerElement(array, leftIndex, rightIndex);
        int biggest = (int) getBiggestElement(array, leftIndex, rightIndex);
        Integer[] counter = new Integer[(biggest - smaller) + 1];
        Integer[] temp = new Integer[rightIndex - leftIndex + 1];

        for (int i = 0; i < counter.length; i++) counter[i] = 0;
        for (int i = leftIndex; i <= rightIndex; i++) counter[array[i] - smaller]++;
        for (int i = 1; i < counter.length; i++) counter[i]+= counter[i-1];
        for (int i = 0; i <= rightIndex ; i++) temp[--counter[array[i] - smaller]] = array[i];
        for (int i = leftIndex; i <= rightIndex ; i++) array[i] = temp[i];
    }
}
