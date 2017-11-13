package main.sorting_algorithms.nlogn;

import main.sorting.AbstractSorting;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        mergeSort(array, leftIndex, rightIndex);
    }

    private void mergeSort(T[] array, int leftIndex, int rightIndex) {

        int center;
        if (leftIndex < rightIndex) {
            center = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, center);
            mergeSort(array, center + 1, rightIndex);
            merge(array, leftIndex, center, rightIndex);
        }

    }

    private void merge(T[] array, int left, int center, int right) {
        T[] temp = array.clone();
        int i = left;
        int j = center + 1;
        int k = left;

        while (i <= center && j <= right) {
            if (temp[i].compareTo(temp[j]) <= 0)
                array[k++] = temp[i++];
            else
                array[k++] = temp[j++];
        }

        while (i <= center)
            array[k++] = temp[i++];
        while (j <= right)
            array[k++] = temp[j++];

    }
}
