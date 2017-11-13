package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;
import util.Util;

import static util.Util.swap;

public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {

    private static double SHRINK_FACTOR =  1.247330950103979;

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        combSort(array, leftIndex, rightIndex);
    }

    private void combSort(T[] array, int leftIndex, int rightIndex) {

        int gap = getGap(rightIndex - leftIndex);
        int i = leftIndex;
        boolean swap = true;

        while (gap > 1 && swap) {
            swap = false;
            gap = getGap(gap);
            i = leftIndex;
            while ((i + gap) <= rightIndex) {
                if (array[i].compareTo(array[i + gap]) > 0) {
                    swap(array, i, i + gap);
                    swap = true;
                }
                i++;
            }
        }
    }

    private int getGap(int gap) {
        gap = (int) (gap / SHRINK_FACTOR);
        if (gap == 9 || gap == 10)
            gap = 11;
        if (gap < 1)
            gap = 1;
        return gap;
    }


}
