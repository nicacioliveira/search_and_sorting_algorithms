package main.sorting_algorithms.nlogn;

import main.sorting.AbstractSorting;
import util.Util;

import java.util.Arrays;

import static util.Util.swap;

public class ThreeWayQuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        threeWayQuickSort(array, leftIndex, rightIndex);
    }

    private void threeWayQuickSort(T[] array, int leftIndex, int rightIndex) {

        if (leftIndex < rightIndex) {
            int[] pivots = getPivots(array, leftIndex, rightIndex);
            threeWayQuickSort(array, leftIndex, pivots[0] - 1);
            threeWayQuickSort(array, pivots[1] + 1, rightIndex);
        }
    }

    private int[] getPivots(T[] array, int l, int r) {
        int min = l, max = r, i = l;
        T cmp = array[l];
        while (i <= max)
            if (array[i].compareTo(cmp) < 0)
                swap(array, i++, min++);
            else if (array[i].compareTo(cmp) > 0)
                swap(array, i, max--);
            else
                i++;
        return new int[]{min, max};
    }
}
