package main.sorting_algorithms.n2;

import main.AbstractSorting;

import static util.Util.swap;

public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        bubbleSort(array, leftIndex, rightIndex);
    }

    private void bubbleSort(T[] array, int leftIndex, int rightIndex) {
        for (int i = leftIndex; i <= rightIndex; i++)
            for (int j = leftIndex + 1; j <= rightIndex; j++)
                if (array[j].compareTo(array[j-1]) < 0)
                    swap(array, j, j-1);
    }
}
