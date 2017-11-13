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

    }



}
