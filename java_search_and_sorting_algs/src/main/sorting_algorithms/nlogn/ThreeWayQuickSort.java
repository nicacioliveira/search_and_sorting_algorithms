package main.sorting_algorithms.nlogn;

import main.AbstractSorting;
import static util.Util.swap;

public class ThreeWayQuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        threeWayQuickSort(array, leftIndex, rightIndex);
    }

    private void threeWayQuickSort(T[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int i = leftIndex, j = rightIndex, k = leftIndex;
            T pivotObj = array[leftIndex];
            while (k <= j)
                if (array[k].compareTo(pivotObj) == -1)
                    swap(array, k++, i++);
                else if (array[k].compareTo(pivotObj) == 1)
                    swap(array, k, j--);
                else
                    k++;
            threeWayQuickSort(array, leftIndex, i-1);
            threeWayQuickSort(array, j+1, rightIndex);
        }
    }
}
