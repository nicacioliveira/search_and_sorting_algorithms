package main.sorting_algorithms.nlogn;

import main.sorting.AbstractSorting;
import util.Util;

import static util.Util.swap;

public class QuickSortDualPivot<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        quickSortDualPivot(array, leftIndex, rightIndex);
    }

    private void quickSortDualPivot(T[] array, int leftIndex, int rightIndex) {

        if (leftIndex < rightIndex) {

            int p1 = particiona(array, leftIndex, rightIndex);
            int p2 = particiona(array, p1, rightIndex);

            quickSortDualPivot(array, leftIndex, p1 - 1);
            quickSortDualPivot(array, p1 + 1, p2 - 1);
            quickSortDualPivot(array, p2 + 1, rightIndex);
        }
    }

    private int particiona(T[] array, int leftIndex, int rightIndex) {

        int i = leftIndex;
        int j = rightIndex;
        T pivotObj = array[leftIndex];

        while (i < j) {
            while (i < rightIndex && array[i].compareTo(pivotObj) <= 0) i++;
            while (j > leftIndex && array[j].compareTo(pivotObj) > 0) j--;
            if (i < j) Util.swap(array, i, j);
        }

        Util.swap(array, leftIndex, j);

        return j;
    }


}
