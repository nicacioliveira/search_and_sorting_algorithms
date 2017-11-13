package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        recursiveSelectionSort(array, leftIndex, rightIndex);
    }

    private void recursiveSelectionSort(T[] array, int leftIndex, int rightIndex) {

        if (rightIndex < leftIndex)
            return;
        int s = leftIndex;
        for (int i = leftIndex; i <= rightIndex; i++)
            if (array[s].compareTo(array[i]) > 0)
                s = i;
        Util.swap(array, s, leftIndex);
        recursiveSelectionSort(array, leftIndex+1, rightIndex);
    }
}
