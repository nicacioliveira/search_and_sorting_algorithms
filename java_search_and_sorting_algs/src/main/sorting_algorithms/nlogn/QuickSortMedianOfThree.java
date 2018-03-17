package main.sorting_algorithms.nlogn;

import main.AbstractSorting;

import static util.Util.swap;

public class QuickSortMedianOfThree<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        quickSortMedianOfThree(array, leftIndex, rightIndex);
    }

    private void quickSortMedianOfThree(T[] array, int leftIndex, int rightIndex) {

        if (array.length == 0 || rightIndex == leftIndex || rightIndex - leftIndex <= 0)
            return;

        /*median of 3*/
        int middle = (rightIndex + leftIndex) / 2;
        if (array[leftIndex].compareTo(array[middle]) > 0)
            swap(array, leftIndex, middle);
        if (array[leftIndex].compareTo(array[rightIndex]) > 0)
            swap(array, leftIndex, rightIndex);
        if (array[middle].compareTo(array[rightIndex]) > 0)
            swap(array, middle, rightIndex);

        /*partition*/
        int i = leftIndex, j = rightIndex;
        while (i < j) {
            while (array[i].compareTo(array[leftIndex]) < 0) i++;
            while (array[j].compareTo(array[leftIndex]) > 0) j--;
            if (i <= j) swap(array, i++, j--);
        }

        /*recursively call*/
        if (leftIndex < j)
            quickSortMedianOfThree(array, leftIndex, j);
        if (rightIndex > i)
            quickSortMedianOfThree(array, i, rightIndex);
    }


}
