package main.sorting_algorithms.n2;

import main.AbstractSorting;

import static util.Util.swap;

public class RecursiveSelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        recursiveSelectionSort(array, leftIndex, rightIndex);
    }

    private void recursiveSelectionSort(T[] array, int leftIndex, int rightIndex) {
        if (array.length == 0)
            return;
        int s = leftIndex;
        for (int i = s; i <= rightIndex; i++)
            if (array[i].compareTo(array[s]) < 0)
                s = i;
        swap(array, s, leftIndex);

        if (leftIndex < rightIndex)
            recursiveSelectionSort(array, leftIndex+1, rightIndex);
    }
}
