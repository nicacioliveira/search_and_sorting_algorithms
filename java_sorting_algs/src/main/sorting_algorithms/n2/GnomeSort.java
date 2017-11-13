package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

import static util.Util.swap;

public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        gnomeSort(array, leftIndex, rightIndex);
    }

    private void gnomeSort(T[] array, int leftIndex, int rightIndex) {
        int i = leftIndex;
        while (i <= rightIndex) {
            if (i > leftIndex && array[i].compareTo(array[i-1]) < 0) {
                swap(array, i, i-1);
                i--;
            } else {
                i++;
            }
        }
    }
}
