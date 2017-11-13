package main.sorting_algorithms.nlogn;

import main.sorting.AbstractSorting;

import static util.Util.swap;

public class QuickSortMedianOfThree<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        quickSortMedianOfThree(array, leftIndex, rightIndex);
    }

    private void quickSortMedianOfThree(T[] array, int leftIndex, int rightIndex) {

        /*check*/
        if (array.length == 0 || rightIndex - leftIndex == 0 || rightIndex == leftIndex)
            return;

        /*median*/
        int middle = (leftIndex + rightIndex) / 2;

        if (array[leftIndex].compareTo(array[middle]) > 0)
            swap(array, leftIndex, middle);

        if (array[leftIndex].compareTo(array[rightIndex]) > 0)
            swap(array, rightIndex, leftIndex);

        if (array[middle].compareTo(array[rightIndex]) > 0)
            swap(array, middle, rightIndex);

        T objPivot = array[leftIndex];

        int i = leftIndex, j = rightIndex;

        /*partitioner*/
        while (i < j) {
            while (array[i].compareTo(objPivot) < 0) i++;
            while (array[j].compareTo(objPivot) > 0) j--;
            if (i <= j) swap(array, i++, j--);
        }

        /*recursively*/
        if (leftIndex < j)
            quickSortMedianOfThree(array, leftIndex, j);
        if (rightIndex > i)
            quickSortMedianOfThree(array, i, rightIndex);
    }


}
