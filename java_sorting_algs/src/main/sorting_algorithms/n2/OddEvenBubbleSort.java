package main.sorting_algorithms.n2;

import main.sorting.AbstractSorting;

import static util.Util.swap;

public class OddEvenBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            /*odd-even*/
            for (int i = leftIndex + 1; i < rightIndex; i += 2)
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            /*even-odd*/
            for (int i = leftIndex; i < rightIndex; i += 2)
                if (array[i].compareTo(array[i+1]) > 0) {
                    swap(array, i, i + 1);
                sorted = false;
                }
        }
    }
}
