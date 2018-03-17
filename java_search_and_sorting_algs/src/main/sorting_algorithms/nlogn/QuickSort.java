package main.sorting_algorithms.nlogn;

import main.AbstractSorting;

import static util.Util.swap;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        quickSort(array, leftIndex, rightIndex);
    }

    /**
     * @param array
     * @param leftIndex
     * @param rightIndex
     */
    private void quickSort(T[] array, int leftIndex, int rightIndex) {

        /*check*/
        if (array.length == 0 || rightIndex - leftIndex == 0 || rightIndex == leftIndex)
            return;

        /* partitioning */
        int i = leftIndex, j = rightIndex;
        T pivotObj = array[(rightIndex + leftIndex) / 2];
        while (i < j) {
            while (array[i].compareTo(pivotObj) < 0) i++;
            while (array[j].compareTo(pivotObj) > 0) j--;
            if (i <= j) swap(array, i++, j--);
        }

        /*divide*/
        if (leftIndex < j)
            quickSort(array, leftIndex, j);
        if (rightIndex > i)
            quickSort(array, i, rightIndex);

    }
}
