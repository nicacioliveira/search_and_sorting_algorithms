package main;

public abstract class AbstractSearch<T extends Comparable<T>> implements Search<T>{
    @Override
    public int search(T[] array, T element) {
        return search(array, element, 0, array.length-1);
    }

    public abstract int search(T[] arrah, T element, int leftIndex, int rightIndex);
}
