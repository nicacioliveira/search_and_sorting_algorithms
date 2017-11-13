package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

import static util.Util.swap;

public class SelectionSort extends AbstractSorting {
    @Override
    public void sort(Comparable[] array, int leftIndex, int rightIndex) {
        selectionSort(array, leftIndex, rightIndex);
    }

    private void selectionSort(Comparable[] array, int leftIndex, int rightIndex) {
        int sel = leftIndex;
        for (int i = leftIndex; i <= rightIndex ; i++) {
            sel = i;
            for (int j = i; j <= rightIndex ; j++)
                if (array[sel].compareTo(array[j]) > 0)
                    sel = j;
            swap(array, sel, i);
        }
    }
}
