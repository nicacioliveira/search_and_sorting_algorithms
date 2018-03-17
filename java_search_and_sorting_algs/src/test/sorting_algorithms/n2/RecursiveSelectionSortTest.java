package test.sorting_algorithms.n2;

import main.sorting_algorithms.n2.RecursiveSelectionSort;
import test.sorting_algorithms.GenericTest;

public class RecursiveSelectionSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new RecursiveSelectionSort();
    }
}