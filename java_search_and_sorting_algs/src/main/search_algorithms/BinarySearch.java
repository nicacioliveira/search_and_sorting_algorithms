package main.search_algorithms;

import main.AbstractSearch;

public class BinarySearch<T extends Comparable<T>> extends AbstractSearch<T>{

    @Override
    public int search(T[] array, T element, int leftIndex, int rightIndex) {
        return binarySearch(array, element, leftIndex, rightIndex);
    }


    private int binarySearch(T[] array, T element, int leftIndex, int rightIndex) {
        int mid = (leftIndex + rightIndex) / 2;

        if (leftIndex > rightIndex || mid >= array.length || mid < 0)
            return -1;

        T midValue = array[mid];

        if (midValue.equals(element))
            return mid;
        else if (midValue.compareTo(element) < 0)
            return binarySearch(array, element, mid+1, rightIndex);
        else
            return binarySearch(array, element, leftIndex-1, mid);
    }


    public static void main(String[] args) {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array = {0, 1,2,3,4,5,6,7,8,9,10};
        System.out.println(bs.search(array, 0, 0, array.length));
    }

}
