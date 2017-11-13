package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        insertionSort(array, leftIndex, rightIndex);
    }

    private void insertionSort(T[] array, int leftIndex, int rightIndex) {
        int j = leftIndex;
        for (int i = leftIndex + 1; i <= rightIndex ; i++) {
            j = i;
            while (j > leftIndex && array[j].compareTo(array[j-1]) < 0) {
                Util.swap(array, j, j - 1);
                j--;
            }
        }
    }
}
