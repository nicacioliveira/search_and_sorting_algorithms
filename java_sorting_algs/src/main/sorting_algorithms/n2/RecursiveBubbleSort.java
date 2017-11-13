package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

public class RecursiveBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        recursiveBubbleSort(array, leftIndex, rightIndex);
    }

    private void recursiveBubbleSort(T[] array, int leftIndex, int rightIndex) {

        if(rightIndex < leftIndex)
            return;

        for(int i = leftIndex + 1; i <= rightIndex;i++)
            if(array[i].compareTo(array[i - 1]) < 0)
                Util.swap(array, i, i - 1);

        recursiveBubbleSort(array,leftIndex,rightIndex -1);
    }


}
