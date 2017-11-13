package main.sorting_algorithms.nlogn;

import main.sorting.AbstractSorting;

import java.util.Arrays;

import static util.Util.swap;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        mergeSort(array, leftIndex, rightIndex);
    }

    private void mergeSort(T[] array, int leftIndex, int rightIndex) {
        int center;
        if (leftIndex < rightIndex) {
            center = (rightIndex + leftIndex) / 2;

            /*divide*/
            mergeSort(array, leftIndex, center);
            mergeSort(array, center + 1, rightIndex);

            /*merge*/
            T[] temp = array.clone();
            int i = leftIndex, j = center + 1, k = leftIndex;

            while (i <= center && j <= rightIndex)
                if (temp[i].compareTo(temp[j]) <= 0)
                    array[k++] = temp[i++];
                else
                    array[k++] = temp[j++];
            while (i <= center)
                array[k++] = temp[i++];
            while (j <= rightIndex)
                array[k++] = temp[j++];
        }
    }
}
