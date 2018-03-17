package main.sorting_algorithms.n;

import main.AbstractSorting;

public class RandixSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        randixSort(array, leftIndex, rightIndex);
    }

    private void randixSort(T[] array, int l , int r) {

    }
}
