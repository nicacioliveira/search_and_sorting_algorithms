package main.sorting;

public interface Sorting<T extends Comparable<T>> {
    void sort(T[] array);
}
