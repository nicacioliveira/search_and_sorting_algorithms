package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        bubbleSort(array, leftIndex, rightIndex);
    }

    private void bubbleSort(T[] array, int leftIndex, int rightIndex) {

        for (int i = leftIndex; i < rightIndex; i++)
            for (int j = leftIndex; j < rightIndex; j++)
                if (array[j].compareTo(array[j + 1]) > 0)
                    Util.swap(array, j, j + 1);

    }
}
