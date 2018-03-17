package main;

public interface Search<T extends Comparable<T>> {
    int search(T[] array, T element);
}
