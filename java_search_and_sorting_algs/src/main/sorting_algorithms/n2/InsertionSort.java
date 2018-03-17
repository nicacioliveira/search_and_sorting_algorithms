package main.sorting_algorithms.n2;

import main.AbstractSorting;

import static util.Util.swap;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        insertionSort(array, leftIndex, rightIndex);
    }

    private void insertionSort(T[] array, int leftIndex, int rightIndex) {
        int j;
        for (int i = leftIndex; i <= rightIndex; i++) {
            j = i - 1;
            while (j >= leftIndex && array[j].compareTo(array[j + 1]) > 0) {
                swap(array, j, j + 1);
                j--;
            }
        }
    }
}
