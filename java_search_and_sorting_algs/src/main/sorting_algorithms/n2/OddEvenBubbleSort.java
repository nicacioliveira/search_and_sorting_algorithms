package main.sorting_algorithms.n2;

import main.AbstractSorting;

import static util.Util.swap;

public class OddEvenBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        oddEvenBubbleSort(array, leftIndex, rightIndex);
    }

    private void oddEvenBubbleSort(T[] array, int leftIndex, int rightIndex) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = leftIndex + 1; i < rightIndex ; i+=2)
                if (array[i].compareTo(array[i+1]) > 0) {
                    sorted = false;
                    swap(array, i, i+1);
                }

            for (int i = leftIndex; i < rightIndex ; i+=2)
                if (array[i].compareTo(array[i+1]) > 0) {
                    sorted = false;
                    swap(array, i, i + 1);
                }
        }
    }
}
