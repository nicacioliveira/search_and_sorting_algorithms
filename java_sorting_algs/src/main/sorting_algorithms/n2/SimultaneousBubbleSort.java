package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

public class SimultaneousBubbleSort extends AbstractSorting {
    @Override
    public void sort(Comparable[] array, int leftIndex, int rightIndex) {
        simultaneousBubbleSort(array, leftIndex, rightIndex);
    }

    private void simultaneousBubbleSort(Comparable[] array, int l, int r) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = l + 1; i <= r; i++)
                if (array[i].compareTo(array[i - 1]) < 0) {
                    Util.swap(array, i, i - 1);
                    swap = true;
                }

            l++;

            for (int i = r - 1; i >= l; i--)
                if (array[i - 1].compareTo(array[i]) > 0) {
                    Util.swap(array, i, i - 1);
                    swap = true;
                }

            r--;
        }
    }
}
