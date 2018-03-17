package main.sorting_algorithms.n2;

import main.AbstractSorting;

import static util.Util.swap;

public class RecursiveBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        recursiveBubbleSort(array, leftIndex, rightIndex);
    }

    private void recursiveBubbleSort(T[] array, int leftIndex, int rightIndex) {
        for (int j = leftIndex + 1; j <= rightIndex; j++)
            if (array[j].compareTo(array[j - 1]) < 0)
                swap(array, j, j - 1);
        if (leftIndex < rightIndex)
            recursiveBubbleSort(array, leftIndex, rightIndex-1);
    }
}
