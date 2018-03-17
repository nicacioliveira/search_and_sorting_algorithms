package main.sorting_algorithms.nlogn;

import main.AbstractSorting;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {
    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        recursiveMergeSort(array, leftIndex, rightIndex);
    }

    private void recursiveMergeSort(T[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int center = (leftIndex + rightIndex) / 2;

            // divide
            recursiveMergeSort(array, leftIndex, center);
            recursiveMergeSort(array, center + 1, rightIndex);

            // conquer
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

    private void iterativeMergeSort(T[] array, int leftIndex, int rightIndex) {

    }

    public static void main(String[] args) {
        MergeSort<Integer> merge = new MergeSort<>();
        Integer[] array = {5,2,3,1,6,4,7,9,0,8};
        System.out.println(Arrays.toString(array));
        merge.sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
