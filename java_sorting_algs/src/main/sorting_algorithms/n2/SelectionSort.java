package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

public class SelectionSort extends AbstractSorting {
    @Override
    public void sort(Comparable[] array, int leftIndex, int rightIndex) {
        selectionSort(array, leftIndex, rightIndex);
    }

    private void selectionSort(Comparable[] array, int l, int r) {
        int sel = l;
        for (int i = l; i <= r; i++) {
            sel = i;
            for (int j = i+1; j <= r ; j++) {
                if (array[j].compareTo(array[sel]) < 0)
                    sel = j;
            }
            Util.swap(array, sel, i);
        }
    }
}
